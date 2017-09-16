package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int N = Integer.parseInt(reader.readLine());
        final int M = Integer.parseInt(reader.readLine());

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            strings.add(reader.readLine());
        }

        reader.close();

        for (int i = 0; i < M; i++) {
            strings.add(strings.get(i));
        }

        for (int i = 0; i < M; i++) {
            strings.remove(0);
        }

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
