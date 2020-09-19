package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat arsik = new Cat("Arsik",5,10,12);
        Cat barsik = new Cat("Barsik", 5, 10,15);
        Cat carsik = new Cat("Carsik", 7,8,9);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}