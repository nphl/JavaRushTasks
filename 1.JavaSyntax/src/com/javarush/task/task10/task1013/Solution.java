package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String firstName;
        private String lastName;
        private boolean sex; // true - male, false - female
        private byte dayOfBirth;
        private byte monthOfBirth;
        private short yearOfBirth;

        public Human() {
            this.firstName = "";
            this.lastName = "";
            this.sex = true;
            this.dayOfBirth = 1;
            this.monthOfBirth = 1;
            this.yearOfBirth = 1970;
        }

        public Human(Human human) {
            this.firstName = human.firstName;
            this.lastName = human.lastName;
            this.sex = human.sex;
            this.dayOfBirth = human.dayOfBirth;
            this.monthOfBirth = human.monthOfBirth;
            this.yearOfBirth = human.yearOfBirth;
        }

        public Human(Human human, String firstName) {
            this.firstName = firstName;
            this.lastName = human.lastName;
            this.sex = human.sex;
            this.dayOfBirth = human.dayOfBirth;
            this.monthOfBirth = human.monthOfBirth;
            this.yearOfBirth = human.yearOfBirth;
        }

        public Human(Human human, String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = human.sex;
            this.dayOfBirth = human.dayOfBirth;
            this.monthOfBirth = human.monthOfBirth;
            this.yearOfBirth = human.yearOfBirth;
        }

        public Human(Human human, String firstName, String lastName, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.dayOfBirth = human.dayOfBirth;
            this.monthOfBirth = human.monthOfBirth;
            this.yearOfBirth = human.yearOfBirth;
        }

        public Human(String firstName) {
            this.firstName = firstName;
            this.lastName = "";
            this.sex = true;
            this.dayOfBirth = 1;
            this.monthOfBirth = 1;
            this.yearOfBirth = 1970;
        }

        public Human(String firstName, boolean sex) {
            this.firstName = firstName;
            this.lastName = "";
            this.sex = sex;
            this.dayOfBirth = 1;
            this.monthOfBirth = 1;
            this.yearOfBirth = 1970;
        }

        public Human(String firstName, String lastName, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.dayOfBirth = 1;
            this.monthOfBirth = 1;
            this.yearOfBirth = 1970;
        }

        public Human(String firstName, String lastName, boolean sex, short yearOfBirth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.dayOfBirth = 1;
            this.monthOfBirth = 1;
            this.yearOfBirth = yearOfBirth;
        }

        public Human(String firstName, String lastName, boolean sex, byte dayOfBirth, byte monthOfBirth, short yearOfBirth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.dayOfBirth = dayOfBirth;
            this.monthOfBirth = monthOfBirth;
            this.yearOfBirth = yearOfBirth;
        }
    }
}
