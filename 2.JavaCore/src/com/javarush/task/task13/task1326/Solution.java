package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        ArrayList<Integer> arrayList = new ArrayList<>();
        String inputString;
        int checkedNumber;
        while ((inputString = fileReader.readLine()) != null) {
            checkedNumber = Integer.parseInt(inputString);
            if (checkedNumber % 2 == 0) {
                arrayList.add(checkedNumber);
            }
        }
        fileReader.close();

        arrayList.sort(Comparator.naturalOrder());

        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }
}