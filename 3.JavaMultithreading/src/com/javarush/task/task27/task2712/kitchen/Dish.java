package com.javarush.task.task27.task2712.kitchen;

import java.util.*;
import java.util.stream.Collectors;

public enum Dish {  //Список доступных блюд

    FISH(25),
    STEAK(30),
    SOUP(15),
    JUICE(5),
    WATER(3);

    private int duration;

    public int getDuration() {
        return duration;
    }

    Dish(int duration) {
        this.duration = duration;
    }

    public static String allDishesToString() { //динамический список блюд
        List<Dish> dishes = Arrays.asList(Dish.values());
        Collections.shuffle(dishes);

        return dishes.stream()
                .map(Dish::toString)
                .collect(Collectors.joining(", "));
    }
}
