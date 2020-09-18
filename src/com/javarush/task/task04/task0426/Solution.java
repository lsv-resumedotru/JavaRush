package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arg = Integer.parseInt(reader.readLine());
        int arg2 = arg % 2;

        if ( arg > 0 && arg2 == 0 )
            System.out.println("положительное четное число");
        else if (arg < 0 && arg2 != 0 )
            System.out.println("отрицательное нечетное число");
        else if (arg < 0 && arg2 == 0 )
            System.out.println("отрицательное четное число");
        else if (arg > 0 && arg2 != 0 )
            System.out.println("положительное нечетное число");
        else if (arg == 0)
            System.out.println("ноль");


    }
}
