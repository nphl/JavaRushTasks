package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }

        reader.close();

        int counter = 1;
        int maxCount = 1;
        for (int i = 1; i < array.size(); i++) {
            if (!array.get(i - 1).equals(array.get(i))) {
                counter = 1;
            } else {
                counter++;
                if (counter > maxCount) maxCount = counter;
            }
        }

        System.out.println(maxCount);
    }
}