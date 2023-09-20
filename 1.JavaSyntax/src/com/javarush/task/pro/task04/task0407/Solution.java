package com.javarush.task.pro.task04.task0407;

/* 
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {

       int digital = 0;
       int sum = 0;

       while(digital <= 100){
           if((digital % 3) == 0){
               digital++;
               continue;
           }
           sum += digital;
           digital++;
       }
        System.out.println(sum);
    }
}