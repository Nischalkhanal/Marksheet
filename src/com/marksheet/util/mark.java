/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marksheet.util;

import java.util.Scanner;
import com.marksheet.test.util.Test;

/**
 *
 * @author nickhnl
 */
public class mark {

    public void mrk(String name, int sym) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter narks in Java");
        int a = input.nextInt();
        System.out.println("Enter marks in PHP");
        int b = input.nextInt();
        System.out.println("Enter marks in Python");
        int c = input.nextByte();
        System.out.println("Enter marks in Networking");
        int d = input.nextInt();
        System.out.println("Enter marks in Multimedia");
        int e = input.nextInt();
        System.out.println("\n  -----MARKSHEET-----");
        System.out.println(String.format("\nName: %s\tSymbol No.: %d", name, sym));

        Test tt = new Test();
        tt.Test(a, b, c, d, e);

    }

}
