package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            String s = reader.readLine();
            a[i] = Integer.parseInt(s);
        }

        int[] b = new int[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }

        int[] c = new int[10];
        for (int i = 0; i < b.length; i++) {
            c[i] = a[i + 10];
        }

        for (int i = 0; i < c.length; i++)
            System.out.println(c[i]);
    }
}
