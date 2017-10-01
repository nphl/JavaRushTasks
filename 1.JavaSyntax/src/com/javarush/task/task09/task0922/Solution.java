package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //String input = "08/18/2013";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        if (input != null && !input.isEmpty()) {
            SimpleDateFormat sDF = new SimpleDateFormat("MM/dd/yyyy");
            Date date = sDF.parse(input);
            SimpleDateFormat sDF2 = new SimpleDateFormat("MMM dd, yyyy");
            System.out.println(sDF2.format(date).toUpperCase());
        }
        reader.close();
    }
}