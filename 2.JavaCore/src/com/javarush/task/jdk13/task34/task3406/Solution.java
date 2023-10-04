package com.javarush.task.jdk13.task34.task3406;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/* 
Классные методы
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        print(getMethods(Set.of(Object.class, Math.class, Arrays.class)));
    }

    public static Map<Class<?>, Set<String>> getMethods(Set<Class<?>> classes) {

        return classes.stream()
                .collect(Collectors.toMap(
                        aClass -> aClass,
                        aClass -> Arrays.stream(aClass.getMethods())
                                .filter(method -> Modifier.isStatic(method.getModifiers()))
                                .map(Method::getName)
                                .collect(Collectors.toSet()),
                        (oldV, newV) -> newV
                ));
    }

    public static void print(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
