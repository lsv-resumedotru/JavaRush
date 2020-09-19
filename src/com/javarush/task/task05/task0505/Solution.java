package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        Cat catArsik = new Cat("Arsik", 5, 10, 5);
        Cat catBarsik = new Cat("Barsik", 6, 11, 6);
        Cat catCarsik = new Cat("Carsik",7,12,7);

        boolean a = catArsik.fight(catBarsik);
        System.out.println(a);
        boolean b = catArsik.fight(catCarsik);
        System.out.println(b);
        boolean c = catCarsik.fight(catBarsik);
        System.out.println(c);

    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
