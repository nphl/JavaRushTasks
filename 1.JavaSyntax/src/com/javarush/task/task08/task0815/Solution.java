package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> people = new HashMap<>();
        for (int i = 0; i < 10; i++)
            people.put(i + "", (i * 100) + "");
        return people;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int counter = 0;
        for (HashMap.Entry<String, String> pair: map.entrySet()) {
            if (name.equals(pair.getValue())) {
                counter++;
            }
        }
        return counter;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int counter = 0;
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            if (lastName.equals(pair.getKey())) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

    }
}
