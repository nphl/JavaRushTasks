package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = reader.readLine().toCharArray();
        reader.close();

        StringBuilder vowelsSB = new StringBuilder("");
        StringBuilder othersSB = new StringBuilder("");

        for (Character c : chars) {
            if (isVowel(c)) {
                vowelsSB.append(c).append(" ");
            } else if (!c.equals(' ')) {
                othersSB.append(c).append(" ");
            }
        }

        System.out.println(vowelsSB.toString());
        System.out.println(othersSB.toString());
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}