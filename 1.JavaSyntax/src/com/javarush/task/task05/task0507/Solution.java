package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, inputValue = 0, quantity = 0;

        while (true) {
            inputValue = Integer.parseInt(reader.readLine());
            if (inputValue == -1) {
                reader.close();
                break;
            }
            sum += inputValue;
            quantity += 1;
        }

        System.out.println((double)sum / quantity);
    }
}

