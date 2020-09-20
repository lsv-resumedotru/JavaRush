package com.javarush.task.task06.task0622;

import java.util.Scanner;
import java.util.Arrays;

/*
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int[] arr = {num1, num2, num3, num4, num5};
        Arrays.sort(arr);
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
