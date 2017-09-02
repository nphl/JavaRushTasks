package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        reader.close();

        int negativeNumbersQuantity = 0;
        int positiveNumbersQuantity = 0;

        negativeNumbersQuantity = firstNumber < 0 ? ++negativeNumbersQuantity : negativeNumbersQuantity;
        negativeNumbersQuantity = secondNumber < 0 ? ++negativeNumbersQuantity : negativeNumbersQuantity;
        negativeNumbersQuantity = thirdNumber < 0 ? ++negativeNumbersQuantity : negativeNumbersQuantity;

        positiveNumbersQuantity = firstNumber > 0 ? ++positiveNumbersQuantity : positiveNumbersQuantity;
        positiveNumbersQuantity = secondNumber > 0 ? ++positiveNumbersQuantity : positiveNumbersQuantity;
        positiveNumbersQuantity = thirdNumber > 0 ? ++positiveNumbersQuantity : positiveNumbersQuantity;

        System.out.println("количество отрицательных чисел: " + negativeNumbersQuantity);
        System.out.println("количество положительных чисел: " + positiveNumbersQuantity);
    }
}
