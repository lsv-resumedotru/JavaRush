package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        while (i<=10){

            while (j<=10){
                System.out.print(i*j + " ");
                j++;
            }
            System.out.println("");
            i++;
            j=1;
        }

    }
}
