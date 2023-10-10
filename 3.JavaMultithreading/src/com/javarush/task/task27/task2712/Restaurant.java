package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Order;

import java.io.IOException;
import java.util.Observable;

public class Restaurant {

    public static void main(String[] args) throws IOException {

        Tablet tablet = new Tablet(5);

        Cook amigoCook = new Cook("Amigo");

        tablet.addObserver(amigoCook);

        tablet.createOrder();

    }
}
