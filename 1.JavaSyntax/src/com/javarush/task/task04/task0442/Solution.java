package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNumber = 0, sum = 0;
        while (inputNumber != -1) {
            inputNumber = Integer.parseInt(reader.readLine());
            sum += inputNumber;
        }
        reader.close();
        System.out.println(sum);
    }
}
