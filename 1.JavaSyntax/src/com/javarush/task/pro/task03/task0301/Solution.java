package com.javarush.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();

        if (temperature < 0) {
            System.out.println("на улице холодно");
        } else {
            System.out.println("на улице тепло");
        }
    }
}
