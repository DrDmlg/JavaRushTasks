package com.javarush.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Random;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {
        String fileName = args[0];
        long number = Long.parseLong(args[1]);
        String text = args[2];

        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            raf.seek(number);

            byte[] mas = new byte[(byte) text.length()];
            raf.read(mas, 0, text.length());

            String string = new String(mas);

            raf.seek(raf.length());
            if (string.equals(text)) {
                raf.write("true".getBytes());
            } else {
                raf.write("false".getBytes());
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
