package com.javarush.task.pro.task12.task1209;

import java.util.ArrayList;
import java.util.Collections;

/* 
Бухгалтерия
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();


    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        for (String pair : waitingEmployees) {
            if(name == null){
                continue;
            }
            if (pair.contains(name)) {
                alreadyGotSalaryEmployees.add(name);
                waitingEmployees.set(waitingEmployees.indexOf(name), null);
            }
        }
    }
}
