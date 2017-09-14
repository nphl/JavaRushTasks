package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("lol");
        listOfStrings.add("kek");
        listOfStrings.add("cheburek");
        listOfStrings.add("1234s");
        listOfStrings.add("last");

        System.out.println(listOfStrings.size());

        for (String s:
                listOfStrings) {
            System.out.println(s);
        }
    }
}
