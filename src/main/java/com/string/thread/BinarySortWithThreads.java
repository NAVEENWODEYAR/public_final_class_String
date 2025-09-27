package com.string.thread;

/**
 * @author Naveen K Wodeyar
 * @date 27-Sept-2025
 */

public class BinarySortWithThreads {

    // Function to perform binary search and find the index where the element should be inserted
    public static int binarySearch(int[] array, int item, int low, int high) {
        if (high <= low) {
            return (item > array[low]) ? (low + 1) : low;
        }

        int mid = (low + high) / 2;

        if (item == array[mid])
            return mid + 1;

        if (item > array[mid])
            return binarySearch(array, item, mid + 1, high);
        return binarySearch(array, item, low, mid - 1);
    }

    // Binary Insertion Sort for a portion of the array
    public static void binaryInsertionSort(int[] array, int start, int end) {
        for (int i = start + 1; i <= end; i++) {
            int selected = array[i];
            int j = i - 1;

            // Find location where selected should be inserted
            int loc = binarySearch(array, selected, start, j);

            // Move elements to make room for selected
            while (j >= loc) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = selected;
        }
    }

    // Thread class for sorting part of the array
    static class SortThread extends Thread {
        int[] array;
        int start, end;

        SortThread(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        public void run() {
            binaryInsertionSort(array, start, end);
        }
    }

    // Function to merge two sorted halves
    public static void merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid)
            temp[k++] = array[i++];

        while (j <= end)
            temp[k++] = array[j++];

        for (i = 0; i < temp.length; i++) {
            array[start + i] = temp[i];
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = { 9, 4, 7, 1, 3, 6, 2, 8, 5 };

        int mid = array.length / 2;

        // Create threads to sort two halves
        SortThread t1 = new SortThread(array, 0, mid - 1);
        SortThread t2 = new SortThread(array, mid, array.length - 1);

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Merge the sorted halves
        merge(array, 0, mid - 1, array.length - 1);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int val : array) {
            System.out.print(val + " ");
        }
    }
}
