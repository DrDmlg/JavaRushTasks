package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try (FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {
            while (fileInputStream.available() > 0) {
                int current = fileInputStream.read();
                list.add(current);
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        list.forEach(word -> {
            map.merge(word, 1, (prev, one) -> prev + 1);
        });

        int min = Collections.min(map.values());

        List<Integer> keys = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) {
                keys.add(entry.getKey());
            }
        }

        keys.forEach(x -> System.out.print(x + " "));
    }
}
