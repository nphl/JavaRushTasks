package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Грибоедов", 200); // 1
        hashMap.put("Пушкин", 20000); // 2
        hashMap.put("Крылов", 2000); // 3
        hashMap.put("Тургенев", 600); // 4
        hashMap.put("Толстой", 350); // 5
        hashMap.put("Достоевский", 450); // 6
        hashMap.put("Глинка", 400); // 7
        hashMap.put("Гоголь", 1500); // 8
        hashMap.put("Некрасов", 380); // 9
        hashMap.put("Чернышевский", 440); // 10

        return hashMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (HashMap.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        /*
        HashMap<String, Integer> hashMap = createMap();
        hashMap.forEach((k, v) -> System.out.println("k: " + k + ", v: " + v));
        System.out.println();
        removeItemFromMap(hashMap);
        hashMap.forEach((k, v) -> System.out.println("k: " + k + ", v: " + v));
        */
    }
}