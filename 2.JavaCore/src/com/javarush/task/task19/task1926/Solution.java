package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Перевертыши
*/

public class Solution {


    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            while (reader.ready()) {
                System.out.print(new StringBuilder(reader.readLine()).reverse() + System.lineSeparator());
            }
        }
    }
}

    /*public static void main2(String[] args) throws IOException {
        String path = "/Users/dmitriy/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1926/file";
        List<String> strings = Files.readAllLines(Path.of(path));
        for (String pair : strings) {
            String collect = Stream.of(pair).map(word-> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
            System.out.println(collect);
        }

    }

    public static void main1(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            while (reader.ready()) {
                String line = reader.readLine();
                char[] chars = line.toCharArray();
                for (int i = chars.length - 1; i >= 0; i--) {
                    System.out.print(chars[i]);
                }
                System.out.print(System.lineSeparator());
            }
        }
    }
}

     */
