package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        String max = "";
        for (String j : strings) {
            if (j.length() > max.length())
                max = j;
        }
        for (String k : strings) {
            if (max.length() == k.length())
                System.out.println(k);
        }
    }
}
