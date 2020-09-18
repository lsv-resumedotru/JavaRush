package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
       int i = 1;
       int num = 1;
       int t = 1;
       while (i <= 10){
           while (t <= 10){
               num = i*t;
               System.out.print(num + " ");
               t++;
           }
           System.out.println();
           i++;
           t = 1;
       }

    }
}
