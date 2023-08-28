package com.javarush.task.task29.task2909.user;

import java.util.concurrent.atomic.AtomicInteger;

public class TestUser {

    public static void main(String[] args) {
        User user = new User("Dmitriy", "Dor", 17);
        user.printAdditionalInfo();

        System.out.println(user.getBoss());

//        UserHelper userHelper = new UserHelper();
//        int i = userHelper.calculateRate(new AtomicInteger(7), 15, true, true);
//        System.out.println(i);
    }
}
