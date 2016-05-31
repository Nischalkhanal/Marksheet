/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marksheet;

import java.util.Scanner;
import com.marksheet.util.mark; //taking input from the user.

/*
 * @author nickhnl
 */
public class program {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name");
            String x = input.nextLine();
            System.out.println("Enter your Symbol No.");
            int y = input.nextInt();
            mark mk = new mark();
            mk.mrk(x, y);
            System.out.println("Do you wanna continue");
            String ch = input.next();
            if (ch.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }
}
