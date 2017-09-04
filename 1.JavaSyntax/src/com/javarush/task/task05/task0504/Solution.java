package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat firstCat = new Cat("Valera", 5, 7, 10);
        Cat secondCat = new Cat("Vitya", 6, 8, 9);
        Cat thirdCat = new Cat("Kolyma", 7, 7, 12);
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