package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human child1 = new Human("Child1", true, 10, null);
        Human child2 = new Human("Child2", true, 12, null);
        Human child3 = new Human("Child3", false, 8, null);

        ArrayList<Human> childs = new ArrayList<>();
        childs.add(child1);
        childs.add(child2);
        childs.add(child3);

        Human father = new Human("Father", true, 45, childs);
        Human mother = new Human("Mother", false, 44, childs);

        ArrayList<Human> fatherArr = new ArrayList<>();
        fatherArr.add(father);

        ArrayList<Human> motherArr = new ArrayList<>();
        motherArr.add(mother);

        Human grandPa1 = new Human("GrandPa1", true, 70, fatherArr);
        Human grandMa1 = new Human("GrandMa1", false, 69, fatherArr);

        Human grandPa2 = new Human("GrandPa2", true, 68, motherArr);
        Human grandMa2 = new Human("GrandMa2", false, 67, motherArr);

        System.out.println(grandPa1);
        System.out.println(grandPa2);
        System.out.println(grandMa1);
        System.out.println(grandMa2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;

        Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            StringBuilder text = new StringBuilder("");
            text.append("Имя: ").append(this.name);
            text.append(", пол: ").append(this.sex ? "мужской" : "женский");
            text.append(", возраст: ").append(this.age);

            if (this.children == null)
                return text.toString();

            int childCount = this.children.size();
            if (childCount > 0) {
                text.append(", дети: ").append(this.children.get(0).name);

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text.append(", ").append(child.name);
                }
            }
            return text.toString();
        }
    }

}
