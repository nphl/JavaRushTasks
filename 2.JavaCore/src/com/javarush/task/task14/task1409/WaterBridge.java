package com.javarush.task.task14.task1409;

public class WaterBridge implements Bridge {
    private final int CARS_COUNT = 100;

    @Override
    public int getCarsCount() {
        return this.CARS_COUNT;
    }
}
