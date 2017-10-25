package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */
        Movie movie;

        do {
            key = reader.readLine();
            movie = MovieFactory.getMovie(key);
            if (movie != null) {
                System.out.println(movie.getClass().getSimpleName());
            }
        } while ("soapOpera".equals(key) || "cartoon".equals(key) || "thriller".equals(key));

        reader.close();

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            /*
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            */
            //напишите тут ваш код, пункты 5,6
            switch (key) {
                case "soapOpera":
                    movie = new SoapOpera();
                    break;
                case "cartoon":
                    movie = new Cartoon();
                    break;
                case "thriller":
                    movie = new Thriller();
                    break;
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3
    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie{
    }
}
