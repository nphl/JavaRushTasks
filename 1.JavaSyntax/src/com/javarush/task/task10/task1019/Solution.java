package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*
        int id = Integer.parseInt(reader.readLine());
        String name = reader.readLine();

        System.out.println("Id=" + id + " Name=" + name);
        */

        HashMap<String, Integer> hashMap = new HashMap<>();
        StringBuilder inputValues = new StringBuilder();
        while (true) {
            inputValues.append(reader.readLine());
            if (inputValues.toString().isEmpty()) {
                break;
            } else {
                inputValues.append("&").append(reader.readLine());
                hashMap.put(inputValues.substring(inputValues.indexOf("&") + 1),
                        Integer.parseInt(inputValues.substring(0, inputValues.indexOf("&"))));
            }
            inputValues.delete(0, inputValues.length());
        }

        reader.close();

        hashMap.forEach((key, value) -> System.out.println(value + " " + key));
    }
}
