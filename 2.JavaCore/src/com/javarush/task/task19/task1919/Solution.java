package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        TreeMap<String, Double> treeMap = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String string = reader.readLine();
                String[] split = string.split(" ");
                String key = split[0];
                double value = Double.parseDouble(split[1]);
                treeMap.merge(key, value, (prev, newValue) -> prev + newValue);

            }
        }
        treeMap.forEach((k, v) -> System.out.println(k + " " + treeMap.get(k)));
    }
}
