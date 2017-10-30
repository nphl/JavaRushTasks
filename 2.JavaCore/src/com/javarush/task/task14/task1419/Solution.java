package com.javarush.task.task14.task1419;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try { // 2
            int[] array = {0, 1, 2};
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException aIOOBE) {
            exceptions.add(aIOOBE);
        }

        try { // 3
            int number = Integer.parseInt("4.5");
        } catch (NumberFormatException nFE) {
            exceptions.add(nFE);
        }

        try { // 4
            Object szStr[] = new String[10];
            szStr[0] = Character.valueOf('*');
        } catch (ArrayStoreException aSE) {
            exceptions.add(aSE);
        }

        try { // 5
            Object object = Character.valueOf('a');
            System.out.println((Byte) object);
        } catch (ClassCastException cCe) {
            exceptions.add(cCe);
        }

        try { // 6
            int[] array = new int[-5];
        } catch (NegativeArraySizeException nASE) {
            exceptions.add(nASE);
        }

        try { // 7
            int[] array = new int[5];
            array = null;
            int length = array.length;
        } catch (NullPointerException nPE) {
            exceptions.add(nPE);
        }

        try { // 8
            String s = "ABC";
            System.out.println(s.charAt(10));
        } catch (StringIndexOutOfBoundsException sIOOBE) {
            exceptions.add(sIOOBE);
        }

        try { // 9
            Class<?> testClass = Solution.class;
            Method method = testClass.getMethod("fooMethod", Solution.class);
        } catch (NoSuchMethodException nSME) {
            exceptions.add(nSME);
        }

        try { // 10
            Class testClass = Class.forName("com.javarush.task.task14.task1419.Class");
        } catch (ClassNotFoundException cNFE) {
            exceptions.add(cNFE);
        }
    }
}
