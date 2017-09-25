package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> cityNameLastName = new HashMap<>();
        while (true) {
            StringBuffer buffer = new StringBuffer();
            buffer.append(reader.readLine());
            if (buffer.toString().isEmpty()) break;

            buffer.append(" ").append(reader.readLine());

            cityNameLastName.put(buffer.substring(0, buffer.indexOf(" ")), buffer.substring(buffer.indexOf(" ") + 1));

            buffer.delete(0, buffer.length());
        }

        String inputCityName = reader.readLine();
        reader.close();

        if (!inputCityName.isEmpty() && cityNameLastName.containsKey(inputCityName)) {
            System.out.println(cityNameLastName.get(inputCityName));
        }
    }
}
