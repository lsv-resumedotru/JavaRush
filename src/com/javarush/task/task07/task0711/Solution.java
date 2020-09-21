package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listok = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listok.add(i, reader.readLine());
        }
        for (int a = 0; a < 13; a++) {
            listok.add(0,listok.remove(4));
        }
        for (int i = 0; i < 5 ; i++) {
            System.out.println(listok.get(i));
        }
    }
}
