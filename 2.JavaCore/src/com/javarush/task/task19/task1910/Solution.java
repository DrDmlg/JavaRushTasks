package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        //String input = "/Users/dmitriy/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1910/file1";
        //String output = "/Users/dmitriy/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1910/file2";

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(console.readLine()))) {
            while (reader.ready()) {
                String string = reader.readLine();
                String newString = string.replaceAll("\\p{Punct}", "");
                String result = newString.replaceAll("\\n", "");
                writer.write(result);
            }
        }


    }
}
