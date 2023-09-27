package com.javarush.task.pro.task10.task1025;

/* 
Взлом ретранслятора
*/

public class Solution {

    public static void main(String[] args) {
        Repeater repeater = new Repeater();

        int repeaterFrequency = repeater.getFrequency();

        if (repeaterFrequency < 100) {
            repeater.setFrequency(repeaterFrequency * 10);
        }

        if (!(repeater.getTrajectory().equalsIgnoreCase("elliptic"))) {
            repeater.setTrajectory("elliptic");
        }

        System.out.println(repeater);
    }
}
