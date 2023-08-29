package com.javarush.task.task29.task2909.human;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Human implements Alive {

    private static int nextId = 0;

    @Getter
    private int id;

    @Getter
    @Setter
    protected int age;

    @Getter
    @Setter
    protected String name;

    @Getter
    @Setter
    private BloodGroup bloodGroup;

    private Size size;

    private List<Human> children = new ArrayList<>();

    public static class Size {

        public int height;
        public int weight;

    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = nextId;
        nextId++;
    }

    @Override
    public void live() {

    }

    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void addChild(Human child) {
        children.add(child);
    }

    public void removeChild(Human child) {
        children.remove(child);
    }

    public void printSize() {
        System.out.printf("Рост: %d Вес: %d", size.height, size.weight);
    }

    public String getPosition() {
        return "Человек";
    }

    public void printData() {
        System.out.println(getPosition() + ": " + name);
    }
}