package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть
*/

public class Solution {
    public static void main(String[] args) {

    }

//add interfaces here - добавь интерфейсы тут
    public interface Fly {
        void flyToPoint(int x, int y);
    }

    public interface Run {
        void runToPoint(int x, int y);
    }

    public interface Swim {
        void swimToPoint(int x, int y);
    }

}
