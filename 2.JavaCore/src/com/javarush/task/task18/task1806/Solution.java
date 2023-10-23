package com.javarush.task.task18.task1806;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* 
Исправить ошибки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("/Users/dmitriy/Desktop/stream/test.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("/Users/dmitriy/Desktop/stream/result.txt");

        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            System.out.println(count);
            outputStream.write(buffer, 0, count);
            System.out.println(Arrays.toString(buffer));
        }

        inputStream.close();
        outputStream.close();


        /*
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");

        if (inputStream.read() >= 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.reset();
        outputStream.flush();

         */
    }
}
