package com.javarush.task.jdk13.task38.task3802;

import java.util.Objects;

public record Car(String name, int weight, int wheelsCount) {

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Car) obj;
        return Objects.equals(this.name, that.name) &&
                this.weight == that.weight &&
                this.wheelsCount == that.wheelsCount;
    }

    @Override
    public String toString() {
        return "Car[" +
                "name=" + name + ", " +
                "weight=" + weight + ", " +
                "wheelsCount=" + wheelsCount + ']';
    }

}
