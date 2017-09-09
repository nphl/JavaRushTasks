package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputValue = reader.readLine();;
        int sum = 0;

        while(!"сумма".equals(inputValue)) {
            sum += Integer.parseInt(inputValue);
            inputValue = reader.readLine();
        }

        reader.close();

        System.out.println(sum);
    }
}
