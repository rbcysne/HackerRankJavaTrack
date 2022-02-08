/*
 * My copyright license
 */
package com.hackerrank.skilltrack;

import java.util.Scanner;

/**
 * 
 * Input Format
 * The first line contains a single string denoting s.
 * The second line contains two space-separated integers denoting the respective values of start and end.
 * 
 * @author rommel
 */
public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        S = S.trim();
        
        if( (S.length() >= 1 && S.length() <= 100) 
            && (start >= 0 && start < end) 
            && (end <= (S.length() + 1)) ) {
            System.out.println(S.substring(start, end));
        }
    }
}
