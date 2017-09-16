package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> dividedByThree = new ArrayList<Integer>();
        ArrayList<Integer> diviedByTwo = new ArrayList<Integer>();
        ArrayList<Integer> otherNums = new ArrayList<Integer>();

        for (Integer x: numbers) {
            if (x % 3 == 0) {
                dividedByThree.add(x);
                if (x % 2 == 0) diviedByTwo.add(x);
            } else if (x % 2 == 0) {
                diviedByTwo.add(x);
            } else {
                otherNums.add(x);
            }
        }

        printList(dividedByThree);
        printList(diviedByTwo);
        printList(otherNums);
    }

    public static void printList(List<Integer> list) {
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}
