package com.javarush.task.pro.task17.task1716;

/* 
Дорожное движение
*/

public interface Vehicle {
    default void start() {
        System.out.println("Начинаю движение.");
    }

    default void move() {
        System.out.println("Еду со средней скоростью 50 км/ч.");
    }

    default void stop() {
        System.out.println("Останавливаюсь.");
    }
}
