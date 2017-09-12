package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] bigArray = new int[20], leftSmallArray = new int[10], rightSmallArray = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
            if (i < 10) {
                leftSmallArray[i] = bigArray[i];
            } else {
                rightSmallArray[i - 10] = bigArray[i];
            }
        }

        for (int elem : rightSmallArray) {
            System.out.println(elem);
        }
    }
}
