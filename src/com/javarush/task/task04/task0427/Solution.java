package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num >= 1 && num <= 999) {

            if ((num % 2) == 0 && num < 10)
                System.out.println("четное однозначное число");
            else if ((num % 2) != 0 && num < 10)
                System.out.println("нечетное однозначное число");
            else if ((num % 2) == 0 && num > 9 && num < 100)
                System.out.println("четное двузначное число");
            else if ((num % 2) != 0 && num > 9 && num < 100)
                System.out.println("нечетное двузначное число");
            else if ((num % 2) == 0 && num > 99)
                System.out.println("четное трехзначное число");
            else if ((num % 2) != 0 && num > 99)
                System.out.println("нечетное трехзначное число");

        }
        else {}

    }
}

