/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.skilltrack;

import java.util.Scanner;

/**
 *
 * @author rommel
 */
public class JavaOutputFormatting {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
            //System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");
        
//        System.out.printf("%-+10.4f%10s\n", Math.E, "=a");
    }
}
