package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.*;

/* 
Встречаемость символов
*/


public class Solution {
    public static void main(String[] args) throws IOException {
        List<Character> list = new ArrayList<>();

        try (FileReader reader = new FileReader(args[0])) {
            while (reader.ready()) {
                list.add((char) reader.read());
            }
        }

        Map<Character, Integer> map = new HashMap<>();
        
        list.forEach(word ->
                map.merge(word, 1, (prev, one) -> prev + one)
        );

        TreeMap<Character, Integer> treeMap = new TreeMap<>(map);

        treeMap.forEach((key, value) -> System.out.println(key + " " + treeMap.get(key)));
    }
}
