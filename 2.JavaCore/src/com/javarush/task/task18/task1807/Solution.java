package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) {
        // /Users/dmitriy/Desktop/stream/test.txt
        List<Character> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try (FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {
            while (fileInputStream.available() > 0) {
                int current = fileInputStream.read();
                list.add((char) current);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == ',') count ++;
        }
        System.out.println(count);


        //list.forEach(x -> System.out.print(x + " "));
    }
}
