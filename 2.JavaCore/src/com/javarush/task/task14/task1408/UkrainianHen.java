package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    final private int EGGS_PER_MONTH = 21;

    @Override
    public int getCountOfEggsPerMonth() {
        return EGGS_PER_MONTH;
    }

    @Override
    public String getDescription() {
        return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), Country.UKRAINE, getCountOfEggsPerMonth());
    }
}
