package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

/*
    — Имя,
    — Имя, вес, возраст
    — Имя, возраст (вес стандартный)
    — вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
    — вес, цвет, адрес (чужой домашний кот)
*/

public class Cat {

    /*

    Валидатор поел говна.
    Закомментированый ниже код не принимается (WTF?).

    private String name = null;
    private int age;
    private int weight;
    private String address = null;
    private String color = null;

    public void initialize(String name) {
        this.name = name;
        this.age = 4;
        this.weight = 5;
        this.color = "white";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "white";
    }

    private void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "white";
    }

    public void initialize(int weight, String color) {
        this.age = 4;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.age = 4;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }
    */

    private String name = null;
    private int weight; //weight
    private int age;
    private String color = null;
    private String address = null;

    public void initialize (String name) {
        this.name = name;
        this.weight = 5;
        this.age = 5;
        this.color = "black";
    }

    public void initialize (String name, int weight, int age) {
        this.name = name;
        this.weight= weight;
        this.age = age;
        this.color = "black";
    }

    public void initialize (String name, int age) {
        this.name = name;
        this.weight= 5;
        this.age = age;

    }

    public void initialize (int weight, String color) {
        this.weight= weight;
        this.age = 5;
        this.color = color;
    }

    public void initialize (int weight, String color, String address) {
        this.weight= weight;
        this.age = 5;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
