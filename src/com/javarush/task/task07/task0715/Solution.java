package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> stroki = new ArrayList<String>();
        stroki.add(0,"мама");
        stroki.add(1,"мыла");
        stroki.add(2,"раму");
        stroki.add(1,"именно");
        stroki.add(3,"именно");
        stroki.add(5,"именно");

        for (int i = 0; i < stroki.size() ; i++) {
            System.out.println(stroki.get(i));
        }

    }
}
