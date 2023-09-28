package com.javarush.task.pro.task11.task1104;

/* 
Конвертер строки
*/

public class Solution {
    public static void main(String[] args) {
        double aDouble;
        String string = "12.84";
        aDouble = Double.parseDouble(string);
        System.out.println(Math.round(aDouble));
    }
}
