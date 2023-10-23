package com.javarush.task.task18.task1816;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (FileReader fileReader = new FileReader(args[0])) {
            int count = 0;
            while (fileReader.ready()) {
                char c = (char) fileReader.read();
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

