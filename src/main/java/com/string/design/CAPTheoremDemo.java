package com.string.design;

/**
 * @author Naveen K Wodeyar
 * @date 08-Feb-2026
 */


class NodeA {
    private String data;

    public NodeA(String data) {
        this.data = data;
    }

    public String read() {
        return data;
    }

    public void write(String data) {
        this.data = data;
    }
}

public class CAPTheoremDemo {

    public static void main(String[] args) {

        NodeA node1 = new NodeA("Version-1");
        NodeA node2 = new NodeA("Version-1");

        boolean networkPartition = true;

        System.out.println("Initial State:");
        System.out.println("Node1: " + node1.read());
        System.out.println("Node2: " + node2.read());

        if (networkPartition) {
            // Availability over Consistency
            node1.write("Version-2");
            System.out.println("\nNetwork partition occurred!");
            System.out.println("Write accepted by Node1");
        } else {
            node1.write("Version-2");
            node2.write("Version-2");
        }

        System.out.println("\nAfter Write:");
        System.out.println("Node1: " + node1.read());
        System.out.println("Node2: " + node2.read());

        System.out.println("\nResult:");
        System.out.println("System is AVAILABLE and PARTITION TOLERANT");
        System.out.println("But CONSISTENCY is compromised");
    }
    
}
