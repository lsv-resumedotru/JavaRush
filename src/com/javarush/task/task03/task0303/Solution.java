package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(15, 0.5));
        System.out.println(convertEurToUsd(20, 0.5));

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur*exchangeRate;

    }
}
