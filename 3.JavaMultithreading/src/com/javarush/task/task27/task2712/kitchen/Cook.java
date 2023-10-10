package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Cook implements Observer { // повар

    private String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object order) {
            ConsoleHelper.writeMessage( "Start cooking - " + order);
    }

    @Override
    public String toString() {
        return name;
    }
}
