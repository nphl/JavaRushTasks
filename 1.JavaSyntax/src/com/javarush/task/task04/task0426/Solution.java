package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        reader.close();

        boolean isNumberEven = (number % 2 == 0);

        if (number < 0) {
            System.out.println(isNumberEven ? "отрицательное четное число" : "отрицательное нечетное число");
        } else if (number > 0) {
            System.out.println(isNumberEven ? "положительное четное число" : "положительное нечетное число");
        } else {
            System.out.println("ноль");
        }
    }
}
