package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Map<String, Double> treeMap = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String string = reader.readLine();
                String[] split = string.split(" ");
                String key = split[0];
                Double value = Double.parseDouble(split[1]);
                treeMap.merge(key, value, Double::sum);
            }
        }
        double max = treeMap.values().stream().max(Double::compare).get();

        for (String key : treeMap.keySet()) {
            if (treeMap.get(key) == max) {
                System.out.println(key);
            }
        }

    }
}
