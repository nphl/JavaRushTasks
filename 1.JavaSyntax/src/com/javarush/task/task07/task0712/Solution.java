package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        int minStringLength = strings.get(0).length(), maxStringLength = strings.get(0).length();
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() < minStringLength) {
                minStringLength = strings.get(i).length();
            }
            if (strings.get(i).length() > maxStringLength) {
                maxStringLength = strings.get(i).length();
            }
        }

        for (String s : strings) {
            if (s.length() == minStringLength || s.length() == maxStringLength) {
                System.out.println(s);
                break;
            }
        }
    }
}
