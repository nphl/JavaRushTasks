package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        int fourthNumber = Integer.parseInt(reader.readLine());
        reader.close();

        int firstMaximum = firstNumber >= secondNumber ? firstNumber : secondNumber;
        int secondMaximum = thirdNumber >= fourthNumber ? thirdNumber : fourthNumber;
        System.out.println(firstMaximum >= secondMaximum ? firstMaximum : secondMaximum);
    }
}
