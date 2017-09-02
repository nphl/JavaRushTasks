package com.javarush.task.task04.task0424;

/* 
Три числа
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

        if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber == thirdNumber) {
            System.out.println(1);
        } else if (secondNumber != firstNumber && firstNumber == thirdNumber) {
            System.out.println(2);
        } else if (thirdNumber != firstNumber && firstNumber == secondNumber) {
            System.out.println(3);
        }
    }
}
