package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String path = br.readLine();
        Scanner scanner = new Scanner(new FileInputStream(path));

        ArrayList<Integer> list = new ArrayList<>();

        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            if (a % 2 == 0) {
                list.add(a);
            }
        }

        Collections.sort(list);
        for (Integer pair : list) {
            System.out.println(pair);
        }

        scanner.close();

    }
}
