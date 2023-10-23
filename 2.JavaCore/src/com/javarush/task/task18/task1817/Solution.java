package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        double symbolsCount = 0;
        double spaceCount = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                Character c = (char) fileReader.read();
                symbolsCount++;
                if (Character.isSpaceChar(c)) spaceCount++;
            }
        }
        double result = (spaceCount / symbolsCount * 100);
        System.out.printf("%.2f", result);
    }
}
