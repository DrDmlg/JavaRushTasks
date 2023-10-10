package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {

    private static BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return console.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> dishes = new ArrayList<>();
        writeMessage(Dish.allDishesToString());
        System.out.println("Введите название блюда");
        while (true) {
            String dishName = readString();
            if (dishName.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                dishes.add(Dish.valueOf(dishName));
            } catch (IllegalArgumentException e) {
                System.out.println("Такого блюда не существует");
            }
        }
        return dishes;
    }
}
