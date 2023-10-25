package com.javarush.task.task19.task1912;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка 2
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;

        ByteArrayOutputStream array = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(array);

        System.setOut(stream);

        testString.printSomething();

        String string = array.toString().replaceAll("te", "??");

        System.setOut(defaultPrintStream);
        System.out.println(string);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
