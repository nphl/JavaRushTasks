package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int xCoord = Integer.parseInt(reader.readLine());
        int yCoord = Integer.parseInt(reader.readLine());
        reader.close();

        if (xCoord > 0) {
            System.out.println(yCoord > 0 ? 1 : 4);
        } else {
            System.out.println(yCoord > 0 ? 2 : 3);
        }
    }
}
