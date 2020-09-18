package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        boolean n = a.equalsIgnoreCase(b);
        if (a.equalsIgnoreCase(b))
            System.out.println("Имена идентичны");
        else if (!a.equalsIgnoreCase(b) && a.length() == b.length())
            System.out.println("Длины имен равны");
        else {}

    }
}
