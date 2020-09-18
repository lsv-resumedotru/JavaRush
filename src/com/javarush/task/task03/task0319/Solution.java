package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        String sBabok = reader.readLine();
        String sYears = reader.readLine();

        int nBabok = Integer.parseInt(sBabok);
        int nYears = Integer.parseInt(sYears);

        System.out.println(name + " получает " + nBabok + " через " + nYears + " лет.");


    }
}
