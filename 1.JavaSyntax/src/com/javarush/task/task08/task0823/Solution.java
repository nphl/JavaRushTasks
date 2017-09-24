package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String[] strings = s.trim().split("\\s+");
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < strings.length; i++) {
            builder.append(strings[i].substring(0, 1).toUpperCase()).append(strings[i].substring(1));
            if (i < strings.length - 1) {
                builder.append(" ");
            }
        }
        System.out.println(builder);
    }
}
