package com.javarush.task.task14.task1409;

public class SuspensionBridge implements Bridge {
    private final int CARS_COUNT = 110;

    @Override
    public int getCarsCount() {
        return this.CARS_COUNT;
    }
}
