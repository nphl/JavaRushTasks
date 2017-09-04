package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {

        // Cats creation
        Cat firstCat = new Cat("Valera", 5, 6, 7);
        Cat secondCat = new Cat("Vitya", 5, 7, 6);
        Cat thirdCat = new Cat("Nikolai", 6, 6, 8);

        System.out.println(firstCat.fight(secondCat));
        System.out.println(firstCat.fight(thirdCat));
        System.out.println(secondCat.fight(thirdCat));
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
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
