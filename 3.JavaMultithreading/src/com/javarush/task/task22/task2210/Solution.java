package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        
        String[] array = getTokens("level22.lesson13.task01", ".");
        System.out.println(Arrays.toString(array));
    }

    public static String[] getTokens(String query, String delimiter) {
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        while (tokenizer.hasMoreTokens()) {
            list.add(tokenizer.nextToken());
        }
        String[] array = list.stream().toArray(String[]::new);
        return array;
    }
}
