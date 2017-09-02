package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstMark = Integer.parseInt(reader.readLine());
        int secondMark = Integer.parseInt(reader.readLine());
        int thirdMark = Integer.parseInt(reader.readLine());
        reader.close();

        int positiveMarksQuantity = 0;
        positiveMarksQuantity = firstMark > 0 ? ++positiveMarksQuantity : positiveMarksQuantity;
        positiveMarksQuantity = secondMark > 0 ? ++positiveMarksQuantity : positiveMarksQuantity;
        positiveMarksQuantity = thirdMark > 0 ?  ++positiveMarksQuantity : positiveMarksQuantity;

        System.out.println(positiveMarksQuantity);
    }
}
