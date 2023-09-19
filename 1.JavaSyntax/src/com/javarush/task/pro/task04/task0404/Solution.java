package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {

        int weight = 5;
        while (weight > 0) {
            int height = 10;
            while (height > 0) {
                System.out.print("Q");
                height--;
            }
            System.out.println();
            weight--;
        }
    }
}