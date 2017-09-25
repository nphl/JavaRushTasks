package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
        // System.out.println(isDateOdd("JANUARY 1 2000"));
        // System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date checkedDate = new Date(date);

        Date checkDateYearStartTime = new Date(date);
        checkDateYearStartTime.setHours(0);
        checkDateYearStartTime.setMinutes(0);
        checkDateYearStartTime.setSeconds(0);

        checkDateYearStartTime.setDate(1);
        checkDateYearStartTime.setMonth(0);

        int msInDay = 24 * 60 * 60 * 1000;
        long msTimeDistance = checkedDate.getTime() - checkDateYearStartTime.getTime();
        int dayCount = (int)(msTimeDistance / msInDay) + 1;

        return (dayCount % 2 != 0);
    }
}
