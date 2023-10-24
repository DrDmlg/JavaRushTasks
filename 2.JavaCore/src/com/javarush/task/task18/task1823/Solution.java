package com.javarush.task.task18.task1823;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String path;
        while (!(path = console.readLine()).equals("exit")) {
            new ReadThread(path).start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
            //implement constructor body
        }

        @Override
        public void run() {
            List<Integer> list = new ArrayList<>();
            try (FileInputStream inputStream = new FileInputStream(fileName)) {
                int[] array = new int[256];
                while (inputStream.available() > 0) {
                    array[inputStream.read()]++;
                }
                int max = Arrays.stream(array).max().getAsInt();


                for (int i = 0; i < array.length; i++) {
                    if (array[i] == max)
                        list.add(i);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            // implement file reading here - реализуйте чтение из файла тут
            //int min = Collections.min(list);
            resultMap.put(fileName, Collections.min(list));
            //resultMap.forEach((k, v) -> System.out.println(k + " " + resultMap.get(k)));
        }
    }
}
