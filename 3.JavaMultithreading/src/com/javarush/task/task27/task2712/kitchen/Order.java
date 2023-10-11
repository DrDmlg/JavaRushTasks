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

    public int getTotalCookingTime() {
        return dishes.stream()
                .mapToInt(Dish::getDuration)
                .sum();
    }

    public boolean isEmpty() {
        return dishes.isEmpty();
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "";
        } else {
            List<Dish> selectedDishes = dishes;
            return "Your order: [" + selectedDishes.stream()
                    .map(Dish::toString)
                    .collect(Collectors.joining(", ")) + "] of " + tablet.toString() + ", cooking time " +
                    getTotalCookingTime() + "min";
        }
    }
}
