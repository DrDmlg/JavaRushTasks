package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Сергей", 5.3);
        grades.put("Антон", 4.5);
        grades.put("Иван", 3.2);
        grades.put("Евкакий", 4.5);
        grades.put("Дмитрий", 3.2);
    }
}
