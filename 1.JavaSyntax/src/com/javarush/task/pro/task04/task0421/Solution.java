package com.javarush.task.pro.task04.task0421;

/* 
Охлаждение ядра планеты
*/

public class Solution {
    public static void main(String[] args) {
        int digit = 1;
        int sum = 0;
        while (digit <= 100) {
            if (digit % 2 == 0) {
                sum += digit;
            }
            digit++;
        }
        System.out.println(sum);
    }
}