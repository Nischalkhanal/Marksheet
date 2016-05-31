/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marksheet.test.util;

/**
 *
 * @author nickhnl
 */
public class Test {

    public void Test(int a, int b, int c, int d, int e) {
        System.out.println("\n\tYour Marks");
        System.out.println(String.format("\n\tJava: %d", a));
        System.out.println(String.format("\n\tPHP: %d", b));
        System.out.println(String.format("\n\tPython: %d", c));
        System.out.println(String.format("\n\tNetworking: %d", d));
        System.out.println(String.format("\n\tMultimedia: %d", e));
        int total = a + b + c + d + e;
        float percentage = total / 5;
        System.out.println(String.format("\nTotal marks:%d", total));
        System.out.println(String.format("Percentage:%f", percentage));

        if (a >= 32 && b >= 32 && c >= 32 && d >= 32 && e >= 32) {
            System.out.println("PASS");
            if (percentage >= 75) {
                System.out.println("GRADE:DISTINCTION");
            } else if (percentage >= 65 && percentage < 75) {
                System.out.println("GRADE:FIRST DIVISION");
            } else if (percentage >= 50 && percentage < 65) {
                System.out.println("GRADE:SECOND DIVISION");
            } else if (percentage >= 40 && percentage < 50) {
                System.out.println("GRADE:PASS");
            }
        } else {
            System.out.println("YOU FAILED");

        }

    }
}
