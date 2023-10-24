package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file1 = console.readLine();
        String file2 = console.readLine();

        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            while (reader.ready()) {
                builder.append(reader.readLine());
            }
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
             BufferedReader bufferedReader = new BufferedReader(new FileReader(file2))) {
            bufferedWriter.write(bufferedReader.readLine() + builder);
        }
    }
}
// String file1 = "/Users/dmitriy/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1819/file1";
//String file2 = "/Users/dmitriy/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1819/file2";

//String file1 = "/Users/dmitriy/Desktop/stream/firstFile.txt";
//String file2 = "/Users/dmitriy/Desktop/stream/secondFile.txt";