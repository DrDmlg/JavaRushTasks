package com.javarush.task.pro.task03.task0318;

import java.util.Scanner;

/* 
Био-мясо
*/

public class Solution {
    public static String NOT_YET = "Искусственное мясо еще не готово.";
    public static String DONE = "Искусственное мясо готово.";
    public static String HORRIBLY_DONE = "Искусственное мясо превратилось в мясного монстра!";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        boolean ready = (hour == 0) && (minute == 30);
        boolean notReady = (hour == 0) && (minute < 30);

        if (ready) {
            System.out.println(DONE);
        } else if (notReady) {
            System.out.println(NOT_YET);
        } else {
            System.out.println(HORRIBLY_DONE);
        }
    }
}

