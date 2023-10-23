package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        // /Users/dmitriy/Desktop/stream/test.txt
        List<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(file1);
             FileOutputStream fileOutputStream = new FileOutputStream(file2)) {
            while (fileInputStream.available() > 0) {
                int current = fileInputStream.read();
                list.add(current);
            }
            Collections.reverse(list);

            list.forEach(pair -> {
                try {
                    fileOutputStream.write(pair);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });



        /*Collections.reverse(list);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file2)) {
            for (Integer pair : list) {
                fileOutputStream.write(pair);
            }
        }

         */

       /* list.forEach(x -> System.out.print(x + " "));
        Collections.reverse(list);
        list.forEach(x -> System.out.print(x + " "));

        */

        }
    }
}
