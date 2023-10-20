package com.javarush.task.task17.task1712;

import java.util.ArrayList;
import java.util.List;

/* 
Ресторан
*/

public class Restaurant {
    public static List<Thread> threads = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Waiter waiterTarget = new Waiter();
        Thread waiter = new Thread(waiterTarget);
        threads.add(waiter);

        Cook cookTarget = new Cook();
        Thread cook = new Thread(cookTarget);
        threads.add(cook);

        waiter.start();
        cook.start();
        cook.join();

        Thread.sleep(1000);
        cookTarget.continueWorking = false; // меняем значение переменной класса Cook(останавливаем готовку)
        Thread.sleep(500);
        waiterTarget.continueWorking = false;
    }
}
