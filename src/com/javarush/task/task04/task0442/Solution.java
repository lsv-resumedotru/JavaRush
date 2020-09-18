package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int b = 0;
        while (a != -1) {
            a = Integer.parseInt(reader.readLine());
            b = b + a;
        }
        System.out.println(b);
    }

}
