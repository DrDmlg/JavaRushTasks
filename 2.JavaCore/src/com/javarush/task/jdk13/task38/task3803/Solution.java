package com.javarush.task.jdk13.task38.task3803;

/* 
Обработка аннотаций
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static <T> boolean printFullyQualifiedNames(Class<T> c) {
        if (c.isAnnotationPresent(PrepareMyTest.class)) {
            Arrays.stream(c.getAnnotation(PrepareMyTest.class).fullyQualifiedNames())
                            .forEach(name -> System.out.println("Array fullyQualifiedNames: " + name));
            return true;
        }
        return false;
    }

    public static <T> boolean printValues(Class<T> c) {
        if (c.isAnnotationPresent(PrepareMyTest.class)) {
            Arrays.stream(c.getAnnotation(PrepareMyTest.class).value())
                    .forEach(name -> System.out.println("Array value: " + name.getSimpleName()));
            return true;
        }
        return false;
    }
}
