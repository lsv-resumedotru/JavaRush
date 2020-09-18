package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int max = 0;
        int min = 0;

        if (a > 0)
            max++;
        else if (a < 0)
            min++;

        if (b > 0)
            max++;
        else if (b < 0)
            min++;

        if (c > 0)
            max++;
        else if (c < 0)
            min++;

        System.out.println("количество отрицательных чисел: " + min);
        System.out.println("количество положительных чисел: " + max);
    }
}
