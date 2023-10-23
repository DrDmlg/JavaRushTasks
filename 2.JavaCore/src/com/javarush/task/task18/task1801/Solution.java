package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        //  /Users/dmitriy/Desktop/stream/test.txt

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        int max = Integer.MIN_VALUE;
        while (fileInputStream.available() > 0) {
            int n = fileInputStream.read();
            if (n > max) {
                max = n;
            }
        }
        fileInputStream.close();
        System.out.println(max);


    }
}
