package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        String inputValue = reader.readLine();;
        while (!"end".equals(inputValue)) {
            strings.add(inputValue);
            inputValue = reader.readLine();
        }

        for (String s : strings) {
            System.out.println(s);
        }
    }
}