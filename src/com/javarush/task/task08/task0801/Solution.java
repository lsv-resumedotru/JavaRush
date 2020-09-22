package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        Set<String> ogorod = new HashSet<String>();
        ogorod.add("арбуз");
        ogorod.add("банан");
        ogorod.add("вишня");
        ogorod.add("груша");
        ogorod.add("дыня");
        ogorod.add("ежевика");
        ogorod.add("женьшень");
        ogorod.add("земляника");
        ogorod.add("ирис");
        ogorod.add("картофель");

        for (String loh : ogorod){
            System.out.println(loh);
        }


    }
}
