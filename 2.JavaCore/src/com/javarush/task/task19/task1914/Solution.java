package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream defaultPrintStream = System.out;

        ByteArrayOutputStream array = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(array);

        System.setOut(stream);

        testString.printSomething();

        System.setOut(defaultPrintStream);

        String s = array.toString();


        String[] string = s.split(" ");
        int x = Integer.parseInt(string[0]);
        int y = Integer.parseInt(string[2]);

        switch (string[1]) {
            case "+":
                System.out.printf("%d %s %d = %d",  x,string[1],y,x + y );
                break;
            case "-":
                System.out.printf("%d %s %d = %d",  x,string[1],y,x - y );
                break;
            case "*":
                System.out.printf("%d %s %d = %d",  x,string[1],y,x * y );
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

