package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>strings = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        String min = strings.get(0);
        for (String j : strings) {
            if (j.length() < min.length())
                min = j;
        }
        for (String k : strings) {
            if (min.length() == k.length())
                System.out.println(k);
        }
    }
}
