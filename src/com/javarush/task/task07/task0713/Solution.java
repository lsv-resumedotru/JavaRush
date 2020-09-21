package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> na3 = new ArrayList<Integer>();
        ArrayList<Integer> na2 = new ArrayList<Integer>();
        ArrayList<Integer> ostalnie = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(i, Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < list.size(); i++) {


            Integer x = list.get(i);
            if ((x % 3 == 0) && (x % 2 == 0)) {
                na3.add(x);   // добавляем x в коллекцию четных чисел
                na2.add(x);    // добавляем x в коллекцию нечетных чисел
            } else if ((x % 3 == 0)&&(x % 2 != 0))    //если x - чётное 3
                na3.add(x);   // добавляем x в коллекцию четных 3 чисел
            else if ((x % 2 == 0)&&(x % 3 != 0))
                na2.add(x);    // добавляем x в коллекцию нечетных чисел
            else if ((x % 3 != 0) && (x % 2 != 0))
                ostalnie.add(x);
        }

            printList(na3);
            printList(na2);
            printList(ostalnie);


    }




    public static void printList(ArrayList<Integer> list) {
        for (int i=0; i< list.size();i++)
            System.out.println(list.get(i));
    }
}
