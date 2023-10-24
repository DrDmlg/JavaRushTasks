package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file1 = console.readLine();
        String file2 = console.readLine();

        String[] split = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {
            while (reader.ready()) {
                split = reader.readLine().split(" ");
            }
            for (String pair : split) {
                bufferedWriter.write((int) Math.round(Double.parseDouble(pair)) + " ");
            }
        }
    }
}



//String file1 = "/Users/dmitriy/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1820/file1";
//String file2 = "/Users/dmitriy/IdeaProjects/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1820/file2";
// String file1 = "/Users/dmitriy/Desktop/stream/file1.txt";
//  String file2 = "/Users/dmitriy/Desktop/stream/file2.txt";

                // Arrays.stream(split).forEach(pair -> System.out.println((int) Math.round(Double.parseDouble(pair))));


            /*for (String pair : split){
                int rounding = (int)Math.round(Double.parseDouble(pair));
                System.out.println(rounding);
            }

             */

           /* for (int i = 0; i < split.length; i++) {
                double rounding = Double.parseDouble(split[i]);
                int n = (int) Math.round(rounding);
                System.out.println(n);
            }

            */
