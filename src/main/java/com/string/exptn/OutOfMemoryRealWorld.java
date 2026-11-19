package com.string.exptn;

/**
 * @author Naveen K Wodeyar
 * @date 18-Nov-2026
 */
public class OutOfMemoryRealWorld {

    private static final int BATCH_SIZE = 100_000; // Safe chunk size (~400 KB per int[] batch)
    private static final int TOTAL_ITEMS_TO_PROCESS = 1_000_000;

    public static void main(String[] args) {
        System.out.println("Warehouse is open. Loading items in safe batches...");

        // 1. Check available free heap before allocating large structures
        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Initial free heap memory (bytes): " + freeMemory);

        // 2. Process data in bounded chunks so memory can be reused across iterations
        int batches = (int) Math.ceil((double) TOTAL_ITEMS_TO_PROCESS / BATCH_SIZE);

        for (int i = 0; i < batches; i++) {
            int currentBatchSize = Math.min(BATCH_SIZE, TOTAL_ITEMS_TO_PROCESS - (i * BATCH_SIZE));

            // Allocate a bounded array instead of Integer.MAX_VALUE (~8 GB)
            int[] batchItems = new int[currentBatchSize];
            populateAndProcess(batchItems, i);

            // 3. Dropping the reference lets the GC reclaim the array once processed
            batchItems = null;
        }

        System.out.println("All items processed safely without exhausting heap memory.");
        // 4. Tip: If your workload legitimately needs more heap, pass a JVM flag like:
        //    java -Xmx2g com.string.exptn.OutOfMemoryRealWorld
    }

    private static void populateAndProcess(int[] batch, int batchIndex) {
        for (int j = 0; j < batch.length; j++) {
            batch[j] = (batchIndex * BATCH_SIZE) + j;
        }
        // Simulate lightweight processing of the current batch
        if (batch.length > 0) {
            System.out.println("Processed batch " + (batchIndex + 1) + " (" + batch.length + " items)");
        }
    }
}