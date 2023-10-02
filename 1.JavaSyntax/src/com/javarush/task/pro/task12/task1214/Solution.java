package com.javarush.task.pro.task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Прощай, Паскаль
*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "Java", "Pascal", "JavaScript", "Ruby"));

    public static void main(String[] args) {
        for (int i = 0; i < programmingLanguages.size(); i++) {
            if (programmingLanguages.get(i).equals("Pascal")) {
                programmingLanguages.remove(i);
                break;
            }
        }
    }
}
