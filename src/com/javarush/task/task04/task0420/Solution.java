package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(reader.readLine());
        int b1 = Integer.parseInt(reader.readLine());
        int c1 = Integer.parseInt(reader.readLine());

        if (a1 > b1 && a1 >= c1 || a1 > c1 && a1 >= b1)
        {
            if (b1 >= c1)
                System.out.println(a1 + " " + b1 + " " + c1);
            else
                System.out.println(a1 + " " + c1 + " " + b1);
        }
        else if (b1 > c1 && b1 >= a1 || b1 >= c1 && b1 > a1)
        {
            if (c1 >= a1)
                System.out.println(b1 + " " + c1 + " " + a1);
            else
                System.out.println(b1 + " " + a1 + " " + c1);
        }
        else if (c1 > b1 && c1 >= a1 || c1 >= b1 && c1 > a1)
        {
            if (a1 >= b1)
                System.out.println(c1 + " " + a1 + " " + b1);
            else
                System.out.println(c1 + " " + b1 + " " + a1);
        }



    }
}
