package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(reader.readLine());
        reader.close();

        while (value > 0) {
            if (value % 10 % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            value /= 10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
