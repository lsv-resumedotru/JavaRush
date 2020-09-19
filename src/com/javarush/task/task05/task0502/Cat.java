package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
            int we = 0, enemy = 0;
            if(this.age > anotherCat.age){
                we++;
            } else if(this.age < anotherCat.age) {
                enemy++;
            }

            if(this.weight > anotherCat.weight){
                we++;
            } else if(this.weight < anotherCat.weight) {
                enemy++;
            }

            if(this.strength > anotherCat.strength){
                we++;
            } else if(this.strength < anotherCat.strength) {
                enemy++;
            }

            return we > enemy;
    }







    public static void main(String[] args) {


    }
}
