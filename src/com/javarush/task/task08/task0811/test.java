package com.javarush.task.task08.task0811;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class test {
    public static void main(String[] args){
        Integer[] a = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        int max =0;
        int min = a[0];
        for (int i = 0; i < 10; i++) {
            if (a[i]>max)
                max = a[i];
        }
        for (int i = 0; i < 10; i++) {
            if (a[i]<min)
                min = a[i];
        }
        System.out.println(max);
        System.out.println(min);
        Arrays.sort(a, Collections.reverseOrder());
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }


    }
}
