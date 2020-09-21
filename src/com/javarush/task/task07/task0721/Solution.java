package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] mass1;

        int maximum = 0;
        int minimum = 0;

        //напишите тут ваш код
        mass1 = getInts();
        Arrays.sort(mass1);
        maximum = mass1[19];
        minimum = mass1[0];


        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код
    public static int [] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[20];
        for (int i = 0; i < 20; i++) {
            mass[i] = Integer.parseInt(reader.readLine());
        }
        return mass;
    }
}
