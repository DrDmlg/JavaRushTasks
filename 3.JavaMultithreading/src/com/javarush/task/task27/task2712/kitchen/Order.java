package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Order {

    private final Tablet tablet;

    protected List<Dish> dishes; //Список выбранных блюд посетителем

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();
    }

    @Override
    public String toString() {
        if (dishes.isEmpty()) {
            return "";
        } else {
            List<Dish> dishes1 = dishes;
            return "Your order: [" + dishes1.stream()
                    .map(Dish::toString)
                    .collect(Collectors.joining(", "))+ "] of " + tablet.toString();
        }
    }
}
