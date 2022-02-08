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
public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (scan.hasNext()) {
            n++;
            System.out.println(n + " " + scan.nextLine());
        }
    }
}
