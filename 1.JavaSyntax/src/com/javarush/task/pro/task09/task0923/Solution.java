package com.javarush.task.pro.task09.task0923;

/* 
Ранг доступа — Пиратский Капитан
*/

import static com.javarush.task.pro.task09.task0923.CaptainBridge.checkAccess;
import static com.javarush.task.pro.task09.task0923.CaptainBridge.debugAccess;

public class Solution {
    public static void main(String[] args) {
        String rank = "";
        if (debugAccess("Раб")) {
            rank = "Раб";
        } else if (debugAccess("Гость")) {
            rank = "Гость";
        } else if (debugAccess("Боец")) {
            rank = "Боец";
        } else if (debugAccess("Ветеран")) {
            rank = "Ветеран";
        } else if (debugAccess("Картографист")) {
            rank = "Картографист";
        } else if (debugAccess("Капитан")) {
            rank = "Капитан";
        } else if (debugAccess("Стив")) {
            rank = "Стив";
        }

        checkAccess(rank);
    }
}
