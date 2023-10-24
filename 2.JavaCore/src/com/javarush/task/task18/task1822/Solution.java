package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String path = console.readLine();
        
        List<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.ready()) {
                String line = reader.readLine();
                list.add(line);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int id = Integer.parseInt(list.get(i).substring(0, list.get(i).indexOf(" ")));
            if(id == Integer.parseInt(args[0])) System.out.println(list.get(i));
        }
    }
}

// String path = "/Users/dmitriy/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1822/file";

       /* Map<Integer, String> hashMap = new HashMap<>();
        for (String key : list) {
            hashMap.put(Integer.parseInt(key.substring(0, 3)), key.substring(4, key.length()));
        }

        for (Integer key : hashMap.keySet()) {
            if(key == Integer.parseInt(args[0])) System.out.println(key + " " + hashMap.get(key));
        }

        //hashMap.forEach((k, v) -> System.out.println(k + " " + hashMap.get(k)));

        */
