package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        reader.close();

        if (number < 1 || number > 999) return;

        boolean isNumberEven = number % 2 == 0;

        if (number / 100 > 0) {
            System.out.println(isNumberEven ? "четное трехзначное число" : "нечетное трехзначное число");
        } else if (number / 10 > 0) {
            System.out.println(isNumberEven ? "четное двузначное число" : "нечетное двузначное число");
        } else if (number < 10) {
            System.out.println(isNumberEven ? "четное однозначное число" : "нечетное однозначное число");
        }
    }
}
