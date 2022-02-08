/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.skilltrack;

import java.util.*;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author rommel
 */
public class JavaLoopsII {
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int s = 0;
            StringBuilder sb = new StringBuilder();
            
            for(int j = 0; j < n; j++) {
                s += (pot(2,j) * b);
                sb.append(a+s);
                sb.append(" ");
            }
            sb.setLength(sb.length()-1);
            System.out.println(sb.toString());
        }
        in.close();
    }
    
    public static int pot(int n, int exp) {
        if(exp == 0) {
            return 1;
        }
        int a = pot(n, exp - 1) * n;
        return a;
    }
}
