package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        reader.close();

        int maximum = Math.max(Math.max(firstNumber, secondNumber), thirdNumber);
        int minimum = Math.min(Math.min(firstNumber, secondNumber), thirdNumber);

        System.out.println(firstNumber + secondNumber + thirdNumber - maximum - minimum);
    }
}
