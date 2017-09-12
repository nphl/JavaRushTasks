package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arrayOfStrings = new String[10];
        int[] arrayOfStringsLengths = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arrayOfStrings.length; i++) {
            arrayOfStrings[i] = reader.readLine();
            arrayOfStringsLengths[i] = arrayOfStrings[i].length();
        }

        for (int elem : arrayOfStringsLengths) {
            System.out.println(elem);
        }
    }
}
