package com.javarush.task.jdk13.task34.task3408;

import java.lang.reflect.InvocationTargetException;

public class Generator<T> {

    private Class<T> aClass;

    public Generator(Class<T> aClass) {
        this.aClass = aClass;
    }

    T newInstance() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return aClass.getDeclaredConstructor().newInstance();
    }
}
