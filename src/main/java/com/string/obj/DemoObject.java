package com.string.obj;

/**
 * @author Naveen K Wodeyar
 * @date 03-Jun-2025
 */

public class DemoObject implements Cloneable {

    private int value;

    public DemoObject(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // Override toString
    @Override
    public String toString() {
        return "DemoObject with value: " + value;
    }

    // Override equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DemoObject that = (DemoObject) obj;
        return value == that.value;
    }

    // Override hashCode
    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }

    // Implement clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // getClass(), notify(), wait(), notifyAll() are inherited without override
}
