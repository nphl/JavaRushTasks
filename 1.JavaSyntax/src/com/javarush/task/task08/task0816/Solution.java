package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {

    public static HashMap<String, Date> createMap() {

        HashMap<String, Date> map = new HashMap<String, Date>();

        map.put("Stallone", new Date("JUNE 1 1980")); // 1
        map.put("Olollone", new Date("JULY 2 1990")); // 2
        map.put("Balkone", new Date("NOVEMBER 4 1981")); // 3
        map.put("Danone", new Date("JANUARY 5 2001")); // 4
        map.put("Antone", new Date("FEBRUARY 20 2003")); // 5
        map.put("Pitone", new Date("APRIL 3 1995")); // 6
        map.put("Kokokone", new Date("AUGUST 31 2002")); // 7
        map.put("Valerone", new Date("JUNE 4 1984")); // 8
        map.put("Iphone", new Date("JANUARY 9 2007")); // 9
        map.put("Zoebal", new Date("SEPTEMBER 21 2017")); // 10

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        // ЧОМУ ТЫ LAMBDA НЕ ЖРЁШЬ ПАСКУДА????
        // map.values().removeIf(d -> d.getMonth() > 4 && d.getMonth() < 8);


        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext();) {
            HashMap.Entry pair = (HashMap.Entry) iterator.next();
            if (((Date)pair.getValue()).getMonth() > 4 && ((Date)pair.getValue()).getMonth() < 8) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        /*
        HashMap<String, Date> map = new HashMap<>();
        map = createMap();
        map.forEach((k, v) -> System.out.println("k: " + k + ", v: " + v));
        System.out.println();
        removeAllSummerPeople(map);
        map.forEach((k, v) -> System.out.println("k: " + k + ", v: " + v));
        */
    }
}
