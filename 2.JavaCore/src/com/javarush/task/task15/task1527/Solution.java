package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = reader.readLine();

            String[] splittedParams = input.substring(input.indexOf('?') + 1).split("&");

            Map<String, String> paramMap = new LinkedHashMap<>();
            for (int i = 0; i < splittedParams.length; i++) {
                int equalitySignPosition = splittedParams[i].indexOf('=');
                if (equalitySignPosition < 0) {
                    paramMap.put(splittedParams[i], null);
                    continue;
                }
                paramMap.put(splittedParams[i].substring(0, equalitySignPosition), splittedParams[i].substring(equalitySignPosition + 1));
            }

            for (String key : paramMap.keySet()) {
                System.out.print(key + " ");
            }

            if (paramMap.get("obj") == null) {
                return;
            }

            System.out.println();

            try {
                alert(Double.parseDouble(paramMap.get("obj")));
            } catch (NumberFormatException nFE) {
                alert(paramMap.get("obj"));
            }

        } catch (IOException iOE) {
            iOE.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
