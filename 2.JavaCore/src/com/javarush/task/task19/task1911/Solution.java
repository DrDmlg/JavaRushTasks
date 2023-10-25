package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //запоминаем настоящий PrintStream в переменную console
        PrintStream console = System.out;

        //создаем динамический массив
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        //передаем массив в конструктор PrintStream
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        //устанавливаем его как текущий System.out
        System.setOut(printStream);

        testString.printSomething();

        String result = byteArrayOutputStream.toString().toUpperCase();
        System.setOut(console);
        System.out.println(result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
