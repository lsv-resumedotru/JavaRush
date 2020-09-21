package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human object1 = new Human("name1",true,55);
        Human object2 = new Human("name2",true,56);
        Human object3 = new Human("name3",false,57);
        Human object4 = new Human("name4",false,58);

        Human object5 = new Human("name5",true,30,object1,object3);
        Human object6 = new Human("name6",false,35,object2,object3);
        Human object7 = new Human("name7",true,5,object5,object6);
        Human object8 = new Human("name8",false,6,object5,object6);
        Human object9 = new Human("name9",true,8,object5,object6);

        System.out.println(object1);
        System.out.println(object2);
        System.out.println(object3);
        System.out.println(object4);
        System.out.println(object5);
        System.out.println(object6);
        System.out.println(object7);
        System.out.println(object8);
        System.out.println(object9);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human  father;
        Human  mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}