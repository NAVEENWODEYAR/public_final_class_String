package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 07-Feb-2026
 */

class Box {
    int value = 10;
}

public class PassByValueTest {

    public static void main(String[] args) {

        Box box = new Box();
        change(box);

        // Object reference not changed
        System.out.println(box.value); // 10
    }

    static void change(Box box) {
        box = new Box(); // local reference change
        box.value = 20;
    }
}
