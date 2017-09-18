package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int NUM = Integer.parseInt(reader.readLine());

        int[] arrayOfNums = new int[NUM];

        for (int i = 0; i < arrayOfNums.length; i++) {
            arrayOfNums[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        int maximum = arrayOfNums[0];

        for (int i = 1; i < arrayOfNums.length; i++) {
            if (arrayOfNums[i] > maximum) maximum = arrayOfNums[i];
        }

        System.out.println(maximum);
    }
}
