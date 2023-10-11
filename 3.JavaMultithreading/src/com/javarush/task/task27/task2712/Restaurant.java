package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Waiter;

import java.io.IOException;

public class Restaurant {

    public static void main(String[] args) throws IOException {

        Tablet tablet = new Tablet(4);
        Cook cook = new Cook("Amigo");
        Waiter waiter = new Waiter();

        tablet.addObserver(cook);
        cook.addObserver(waiter);
        tablet.createOrder();
    }
}
