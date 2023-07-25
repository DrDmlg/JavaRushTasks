package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileInputStream inputStream = new FileInputStream(args[0]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[1])) {

            while (inputStream.available() > 0) {
                byte[] buffer = new byte[inputStream.available()];
                inputStream.read(buffer);
                String s = new String(buffer, "Windows-1251");
                buffer = s.getBytes("UTF-8");
                fileOutputStream.write(buffer);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
