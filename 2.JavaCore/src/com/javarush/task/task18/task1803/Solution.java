package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
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
        list.forEach(word ->
                map.merge(word, 1, (prev, one) -> prev + 1));

        int max = Collections.max(map.values());

        List<Integer> keys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                keys.add(entry.getKey());
            }
        }
        keys.forEach(result -> System.out.print(result + " "));



          /*  int[] array = new int[65535];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try (FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {

            while (fileInputStream.available() > 0) {
                int current = fileInputStream.read();

                for (int i = 0; i < array.length; i++) {
                    if (i == current) {
                        array[i] = array[i] + 1;
                    }
                }
            }
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) System.out.println(i + " ");
        }

       */

    }
}
