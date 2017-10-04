package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        ArrayList<Integer> alpabetCounter = new ArrayList<>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
            alpabetCounter.add(0);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код

        for (String s : list) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < alphabet.size(); j++) {
                    if (alphabet.get(j).equals(s.charAt(i))) {
                        alpabetCounter.set(j, alpabetCounter.get(j) + 1);
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + alpabetCounter.get(i));
        }
    }

}
