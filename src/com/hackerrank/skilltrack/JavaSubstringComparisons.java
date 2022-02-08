/*
 * My copyright license
 */

package com.hackerrank.skilltrack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 * Input Format
 * The first line contains a string denoting s.
 * The second line contains an integer denoting k.
 * 
 * @author rommel
 */

public class JavaSubstringComparisons {

        public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        List<String> subs = new ArrayList<>();
        for(int i = 0; i <= s.length()-k; i++) {
                subs.add(s.substring(i, i+k));
        }
        
        Collections.sort(subs);
        
        smallest = subs.get(0);
        largest = subs.get(subs.size()-1);
        
//        Or you can use a TreeSet
//        SortedSet<String> set = new TreeSet<>();
//        for(int i = 0; i <= s.length()-k; i++) {
////            if(i+k <= s.length()) {
//                set.add(s.substring(i, i+k));
////            }
//        }
//        
//        smallest = set.first();
//        largest = set.last();

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
