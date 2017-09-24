package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Грибоедов" , "Александр"); // 1
        hashMap.put("Пушкин" , "Александр"); // 2
        hashMap.put("Крылов" , "Иван"); // 3
        hashMap.put("Тургенев" , "Иван"); // 4
        hashMap.put("Толстой" , "Лев"); // 5
        hashMap.put("Достоевский" , "Федор"); // 6
        hashMap.put("Глинка" , "Федор"); // 7
        hashMap.put("Грибоедов" , "Николай"); // 8
        hashMap.put("Некрасов" , "Николай"); // 9
        hashMap.put("Чернышевский" , "Николай"); // 10

        return hashMap;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
