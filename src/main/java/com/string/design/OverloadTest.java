/**
 * @author Naveen K Wodeyar
 * @date 14-Feb-2026
 */
package com.string.design;

public class OverloadTest {

    void show(int a) {
        System.out.println("int method");
    }

    void show(Integer a) {
        System.out.println("Integer method");
    }

    public static void main(String[] args) {
        OverloadTest obj = new OverloadTest();
        obj.show(10);
    }
}
