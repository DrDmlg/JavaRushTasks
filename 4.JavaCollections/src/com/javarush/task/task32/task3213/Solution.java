package com.javarush.task.task32.task3213;

import java.io.*;
import java.util.Collections;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        if (reader == null) return "";

        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        StringJoiner stringJoiner = new StringJoiner("");
        while ((line = bufferedReader.readLine()) != null) {
            char[] charArray = line.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                char result = (char) (charArray[i] + key);
                stringJoiner.add(String.valueOf(result));
            }
        }
        return stringJoiner.toString();
    }
}
