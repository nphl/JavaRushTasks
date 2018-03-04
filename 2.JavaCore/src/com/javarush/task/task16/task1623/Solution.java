package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads = 0;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            super(Integer.toString(++countCreatedThreads));
            this.start();
        }

        @Override
        public String toString() {
            return String.format("%s created", this.getName());
        }

        @Override
        public void run() {
            if (countCreatedThreads < count) {
                System.out.println(new GenerateThread());
            }
        }
    }
}