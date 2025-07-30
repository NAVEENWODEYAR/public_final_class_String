package com.string.design;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Naveen K Wodeyar
 * @date 24-Jul-2025
 */

class Node {
    private Map<String, String> data = new HashMap<>();
    private boolean isPartitioned = false;
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public void write(String key, String value) {
        if (isPartitioned) {
            System.out.println(name + ": Cannot write, network partition! (Consistency mode)");
        } else {
            data.put(key, value);
            System.out.println(name + ": Write successful -> " + key + " = " + value);
        }
    }

    public void forceWrite(String key, String value) {
        // Used to simulate AP (Availability mode)
        data.put(key, value);
        System.out.println(name + ": Write forced under partition -> " + key + " = " + value);
    }

    public void read(String key) {
        String value = data.get(key);
        System.out.println(name + ": Read -> " + key + " = " + (value != null ? value : "null"));
    }

    public void setPartitioned(boolean status) {
        this.isPartitioned = status;
        System.out.println(name + ": Network partition = " + status);
    }

    public void sync(Node other) {
        data.putAll(other.data);
        System.out.println(name + ": Synchronized data from " + other.name);
    }

    public String getName() {
        return name;
    }
}

public class CAPTheoremSimulation {
    public static void main(String[] args) {
        Node nodeA = new Node("NodeA");
        Node nodeB = new Node("NodeB");

        System.out.println("== Initial Write ==");
        nodeA.write("x", "1");
        nodeB.sync(nodeA);  // sync to simulate replication

        System.out.println("\n== Simulating Network Partition ==");
        nodeB.setPartitioned(true);

        // Case 1: CP mode (Consistency over Availability)
        nodeB.write("x", "2");  // blocked due to partition

        // Case 2: AP mode (Availability over Consistency)
        System.out.println("\n== Switching to AP Mode ==");
        nodeB.forceWrite("x", "2");  // allows write, breaks consistency

        System.out.println("\n== Reading Values ==");
        nodeA.read("x");
        nodeB.read("x");

        System.out.println("\n== Resolving Partition and Syncing ==");
        nodeB.setPartitioned(false);
        nodeA.sync(nodeB);

        System.out.println("\n== Final Read ==");
        nodeA.read("x");
        nodeB.read("x");
    }
}
