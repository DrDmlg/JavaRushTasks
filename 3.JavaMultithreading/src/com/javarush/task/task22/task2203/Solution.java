package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) {
            throw new TooShortStringException();
        }
        String[] splitWithTabs = string.split("\\t");

        if (splitWithTabs.length < 3) throw new TooShortStringException();

        return splitWithTabs[1];
    }

    public static class TooShortStringException extends Exception {
    }
}
