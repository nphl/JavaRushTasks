package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        reader.close();

        for (int i = 0; i < 13; i++) {
            strings.add(0, strings.get(4));
            strings.remove(5);
        }

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
