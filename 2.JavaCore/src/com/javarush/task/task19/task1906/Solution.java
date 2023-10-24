package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String input = console.readLine();
        String output = console.readLine();
        console.close();

        int count = 1;
        try (FileReader fileReader = new FileReader(input);
             FileWriter fileWriter = new FileWriter(output) ) {
            while (fileReader.ready()) {
                int digital = fileReader.read();
                if (count % 2 == 0) {
                    fileWriter.write((char) digital);
                }
                count++;
            }
        }
    }
}
