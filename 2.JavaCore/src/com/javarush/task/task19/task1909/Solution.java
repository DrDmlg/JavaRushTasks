package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        StringBuilder builder = new StringBuilder();
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(console.readLine()))) {
            while (reader.ready()) {
                String string = reader.readLine();
                char[] chars = string.toCharArray();
                for (char value : chars) {
                    builder = value == '.' ? builder.append('!') : builder.append(value);
                }
                writer.write(builder.toString());
            }
        }
    }
}


       /* String input = "/Users/dmitriy/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1909/file1";
        String output = "/Users/dmitriy/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1909/file2";

        String replace = null;
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(input));
             BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {
            while (reader.ready()) {
                String string = reader.readLine();
                String[] split = string.split("");
                for (String value : split) {
                    if (value.contains(".")) {
                        replace = string.replace(".", "!");
                    }
                }
                    writer.write(replace);
                }

        }
    }
}

        */