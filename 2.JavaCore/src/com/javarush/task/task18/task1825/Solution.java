package com.javarush.task.task18.task1825;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        String outputFile = null;
        String path;
        while (!(path = console.readLine()).equals("end")) {
            list.add(path);
            if (outputFile == null) {
                int indexOfSuffix = path.lastIndexOf(".part");
                outputFile = path.substring(0, indexOfSuffix);
            }
        }
        Collections.sort(list);

        if (outputFile == null) return;
        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
            for (String nextFile : list) {
                try (FileInputStream fileInputStream = new FileInputStream(nextFile)) {
                    byte[] buffer = new byte[fileInputStream.available()];
                    int n = fileInputStream.read(buffer);
                    fileOutputStream.write(buffer, 0, n);
                }
            }
        }
    }
}


        /*for (int i = 0; i < array.size(); i++) {
            try (BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(path, true))) {
                writer.write();
            }

         */



/*

String newPath = Path.of(path).getFileName().toString();
            String n = newPath.substring(0, newPath.lastIndexOf((".")));
     List<Integer> array = new ArrayList<>();
        String path;
        while (!(path = console.readLine()).equals("end")) {
            try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream(path))) {
                while (reader.available() > 0) {
                    array.add(reader.read());
                }
            }
            //array.forEach(x -> System.out.print(x + " "));
        }
        System.out.println(path);

        try (BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(console.readLine(),true))) {
            for (Integer pair : array) {
                writer.write(pair);
            }
        }
    }
}
 */

