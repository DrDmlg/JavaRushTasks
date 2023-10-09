package com.javarush.task.task27.task2712.kitchen;

import java.util.*;
import java.util.stream.Collectors;

public enum Dish {  //Список доступных блюд

    FISH,
    STEAK,
    SOUP,
    JUICE,
    WATER;
    
    public static String allDishesToString() {
        List<Dish> dishes = Arrays.asList(Dish.values());
        Collections.shuffle(dishes);

        return dishes.stream()
                .map(Dish::toString)
                .collect(Collectors.joining(", "));
    }
}
