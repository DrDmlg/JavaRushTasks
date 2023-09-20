package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num < min) {
                int temp = num;
                secondMin = min;
                min = temp;
            } else if (num > min && num < secondMin) {
                secondMin = num;
            }
        }
        System.out.println(secondMin);
    }
}

