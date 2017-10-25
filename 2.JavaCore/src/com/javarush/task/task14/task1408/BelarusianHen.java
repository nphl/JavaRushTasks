package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {

    final private int EGGS_PER_MONTH = 19;

    @Override
    public int getCountOfEggsPerMonth() {
        return EGGS_PER_MONTH;
    }

    @Override
    public String getDescription() {
        return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), Country.BELARUS, getCountOfEggsPerMonth());
    }
}
