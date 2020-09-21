package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listok = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            listok.add(i, reader.readLine());
        }
        listok.remove(2);
        for (int i = 0; i < listok.size(); i++) {
            System.out.println(listok.get(listok.size()-i-1));
        }
    }
}
