package com.string.thread;

import java.util.LinkedList;

/**
 * @author Naveen K Wodeyar
 * @date 30-Apr-2025
 */

class ProducerConsumer {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 5;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (list.size() == capacity)
                    wait();

                list.add(value++);
                System.out.println("Produced: " + (value - 1));
                notify();
                Thread.sleep(500);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (list.isEmpty())
                    wait();

                int val = list.removeFirst();
                System.out.println("Consumed: " + val);
                notify();
                Thread.sleep(500);
            }
        }
    }
}

public class ProducerConsumerTest {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producer = new Thread(() -> {
            try { 
            	pc.produce(); 
            	} catch (InterruptedException e) {
            		
            	}
        });

        Thread consumer = new Thread(() -> {
            try {
            	pc.consume(); 
            	} catch (InterruptedException e) {
            		
            	}
        });

        producer.start();
        consumer.start();
    }
}

