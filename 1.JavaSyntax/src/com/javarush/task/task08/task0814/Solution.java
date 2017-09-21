package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {

        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < 20; i++)
            integers.add(i);

        return integers;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        set.removeIf(i -> i > 10);
        return set;
    }

    public static void main(String[] args) {

    }
}
