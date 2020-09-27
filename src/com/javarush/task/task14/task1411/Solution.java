package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/*
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        String[] keys = {"user", "loser", "coder", "proger"};
        //тут цикл по чтению ключей, пункт 1
        while (Arrays.asList(keys).contains(key = reader.readLine())) {
            //создаем объект, пункт 2
            switch (key) {
                case "user":
                    doWork(person = new Person.User());
                    break;
                case "loser":
                    doWork(person = new Person.Loser());
                    break;
                case "coder":
                    doWork(person = new Person.Coder());
                    break;
                case "proger":
                    doWork(person = new Person.Proger());
                    break;
                default:
                    break;

            }
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
