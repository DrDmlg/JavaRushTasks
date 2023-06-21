package com.javarush.task.pro.task12.task1225;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Аккаунт ИнстаМатрицы
*/

public class Solution {

    public static ArrayList<String> accountsList = new ArrayList<>();

    public static void main(String[] args) {
        convertAccounts();
        registerAccount("Амиго");
        registerAccount("Диего");

        for (String pair : accountsList) {
            System.out.println(pair);
        }
    }

    public static void convertAccounts() {
        for (int i = 0; i < Accounts.getAccounts().length; i++) {
            accountsList.add(i, Accounts.getAccounts()[i]);
        }
        //Collections.addAll(accountsList, Accounts.getAccounts());
    }

    public static void registerAccount(String username) {
        if (!(accountsList.contains(username))) { // что происходит в этой строчке? Идет скрытая итерация по коллекции?
            accountsList.add(username);
        }
    }
}