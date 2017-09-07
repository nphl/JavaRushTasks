package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        this(x, y, 10);
    }

    public Circle(double x) {
        this(x, x, 10);
    }

    public Circle() {
        this(5, 5 , 1);
    }

    public static void main(String[] args) {

    }
}