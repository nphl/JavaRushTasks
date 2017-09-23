package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Грибоедов" , "Александр"); // 1
        map.put("Пушкин" , "Александр"); // 2
        map.put("Крылов" , "Иван"); // 3
        map.put("Тургенев" , "Иван"); // 4
        map.put("Толстой" , "Лев"); // 5
        map.put("Достоевский" , "Федор"); // 6
        map.put("Глинка" , "Федор"); // 7
        map.put("Гоголь" , "Николай"); // 8
        map.put("Некрасов" , "Николай"); // 9
        map.put("Чернышевский" , "Николай"); // 10
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        ArrayList<String> list = new ArrayList<>(map.values());

        int counter;
        for (String s : list) {
            counter = 0;
            for (String s2 : list) {
                if (s.equals(s2)) {
                    counter++;
                }
                if (counter == 2) {
                    removeItemFromMapByValue(map, s);
                }
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        /*
        HashMap<String, String> hashMap = createMap();
        hashMap.forEach((k, v) -> System.out.println("k: " + k + ", v: " + v));
        System.out.println();
        removeTheFirstNameDuplicates(hashMap);
        hashMap.forEach((k, v) -> System.out.println("k: " + k + ", v: " + v));
        */
    }
}
