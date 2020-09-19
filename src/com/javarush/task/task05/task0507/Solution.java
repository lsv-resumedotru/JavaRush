package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double summa = 0;
        double dlina = 0;

        while (true) {
            int a = Integer.parseInt(reader.readLine());

            if (a==(-1))
                break;

            summa = summa + a;
            dlina++;
            }
        double arif = summa/dlina;
        System.out.println(arif);

    }
}

