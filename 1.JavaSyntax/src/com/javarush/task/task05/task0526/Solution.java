package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {

        Man man1 = new Man("Valera", 20, "Saint-Petersburg");
        Man man2 = new Man("Vitya", 21, "Moscow");
        System.out.println(man1);
        System.out.println(man2);

        Woman woman1 = new Woman("Anastasia", 19, "Kostroma");
        Woman woman2 = new Woman("Masha", 23, "Krasnoyarsk");
        System.out.println(woman1);
        System.out.println(woman2);

    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }
}
