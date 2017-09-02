package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        int maximum = Math.max(Math.max(firstNumber, secondNumber), thirdNumber);
        int minimum = Math.min(Math.min(firstNumber, secondNumber), thirdNumber);
        int middle = firstNumber + secondNumber + thirdNumber - maximum - minimum;

        System.out.println(maximum + " " + middle + " " + minimum);

    }
}
