package com.string.obj;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyar
 * @date 03-Jun-2025
 */

public class DemoObjectTest {

    @Test
    public void testToString() {
        DemoObject obj = new DemoObject(10);
        assertEquals("DemoObject with value: 10", obj.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        DemoObject obj1 = new DemoObject(20);
        DemoObject obj2 = new DemoObject(20);
        DemoObject obj3 = new DemoObject(30);

        assertEquals(obj1, obj2);
        assertNotEquals(obj1, obj3);
        assertEquals(obj1.hashCode(), obj2.hashCode());
        assertNotEquals(obj1.hashCode(), obj3.hashCode());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        DemoObject original = new DemoObject(100);
        DemoObject cloned = (DemoObject) original.clone();

        assertEquals(original, cloned);
        assertNotSame(original, cloned);
    }

    @Test
    public void testGetClass() {
        DemoObject obj = new DemoObject(5);
        assertEquals(DemoObject.class, obj.getClass());
    }

    @Test
    public void testWaitNotify() throws InterruptedException {
        final Object lock = new Object();
        final boolean[] wasNotified = {false};

        Thread t = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                    wasNotified[0] = true;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        t.start();
        Thread.sleep(500); // ensure the thread is waiting

        synchronized (lock) {
            lock.notify();
        }

        t.join();
        assertTrue(wasNotified[0]);
    }
}

