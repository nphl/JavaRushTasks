package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber, secondNumber;

        firstNumber = Integer.parseInt(reader.readLine());
        secondNumber = Integer.parseInt(reader.readLine());
        if (firstNumber < 1 || secondNumber < 1) {
            reader.close();
            throw new Exception();
        }
        System.out.println(GCD(firstNumber, secondNumber));
        reader.close();
    }



    private static int GCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
