package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream defaultStream = System.out;

        String path;
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            path = console.readLine();
        }

        ByteArrayOutputStream array = new ByteArrayOutputStream();

        PrintStream printStream = new PrintStream(array);

        System.setOut(printStream);
        testString.printSomething();

        try (FileOutputStream fileOutputStream = new FileOutputStream(path)) {
           fileOutputStream.write(array.toByteArray());
        }

        System.setOut(defaultStream);
        System.out.println(array.toString());

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

