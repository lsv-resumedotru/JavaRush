package com.javarush.task.task08.task0802;

import java.util.HashMap;
import java.util.Map;

/* 
Map из 10 пар
*/

public class Solution {
    public static void main(String[] args) {
        Map<String,String> korzina = new HashMap<String, String>();
        korzina.put("арбуз","ягода");
        korzina.put("банан","трава");
        korzina.put("вишня","ягода");
        korzina.put("груша","фрукт");
        korzina.put("дыня","овощ");
        korzina.put("ежевика","куст");
        korzina.put("жень-шень","корень");
        korzina.put("земляника","ягода");
        korzina.put("ирис","цветок");
        korzina.put("картофель","клубень");

        for (Map.Entry<String,String> pair : korzina.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }


    }
}
