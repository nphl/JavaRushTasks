package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String fileName = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        StringBuilder fileContentBuilder = new StringBuilder();

        while (true) {
            fileContentBuilder.append(reader.readLine());

            if ("exit".equals(fileContentBuilder.toString())) {
                writer.write(fileContentBuilder.toString());
                break;
            } else {
                writer.write(fileContentBuilder.toString() + "\n");
                fileContentBuilder.delete(0, fileContentBuilder.length());
            }
        }

        reader.close();
        writer.close();
    }
}
