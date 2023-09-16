package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        String line1 = console.nextLine();
        String line2 = console.nextLine();

        System.out.println(line2);
        System.out.println(line1.toUpperCase());
        System.out.println(line.toLowerCase());

    }
}
