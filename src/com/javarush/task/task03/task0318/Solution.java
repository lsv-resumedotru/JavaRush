package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNum = reader.readLine();
        String name = reader.readLine();
        int nNum = Integer.parseInt(sNum);
        System.out.println( name + " захватит мир через " + nNum + " лет. Му-ха-ха!");

    }
}
