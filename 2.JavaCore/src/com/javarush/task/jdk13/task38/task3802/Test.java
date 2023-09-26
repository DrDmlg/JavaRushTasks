package com.javarush.task.jdk13.task38.task3802;

public class Test {

    public static void main(String[] args) {
        Car car = new Car("sa", 2, 4);
        System.out.printf("%s %d %d", car.name(), car.weight(), car.wheelsCount());
    }
}
