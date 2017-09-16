package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {

        Human valera = new Human("Valera", true, 55);
        Human anya = new Human("Anya", false, 53);

        Human serega = new Human("Serega", true, 41);
        Human nastya = new Human("Nastya", false, 40);

        Human igor = new Human("Igor", true, 20, valera, anya);
        Human katya = new Human("Katya", false, 17, valera, anya);
        Human vitya = new Human("Vitya", true, 15, valera, anya);

        Human sonya = new Human("Sonya", false, 10, serega, nastya);
        Human ignat = new Human("Ignat", true, 8, serega, nastya);

        System.out.println(valera);
        System.out.println(anya);
        System.out.println(serega);
        System.out.println(nastya);
        System.out.println(igor);
        System.out.println(katya);
        System.out.println(vitya);
        System.out.println(sonya);
        System.out.println(ignat);
    }

    public static class Human {

        private String name;
        private boolean sex;
        private int age;
        private Human father = null;
        private Human mother = null;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this(name, sex, age, null, null);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}