package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "loh1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "loh2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "loh3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "loh4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "loh5";

        Protoss protik1 = new Protoss();
        protik1.name = "pro1";
        Protoss protik2 = new Protoss();
        protik2.name = "pro2";
        Protoss protik3 = new Protoss();
        protik3.name = "pro3";

        Terran tera1 = new Terran();
        tera1.name = "teror1";
        Terran tera2 = new Terran();
        tera2.name = "teror2";
        Terran tera3 = new Terran();
        tera3.name = "teror3";
        Terran tera4 = new Terran();
        tera4.name = "teror4";



    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
