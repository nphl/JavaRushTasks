package com.javarush.task.task16.task1622;

/* 
Последовательные выполнения нитей
*/

public class Solution {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread().join();
            //напишите тут ваш код
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countDownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            try {
                while (true) {
                    System.out.println(this);
                    if (--countDownIndex == 0) {
                        Thread.sleep(10);
                        return;
                    } else if (countDownIndex < 0)
                        throw new InterruptedException();
                }
            } catch (InterruptedException e) {
                System.out.println("Нить прервана");
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countDownIndex;
        }
    }
}