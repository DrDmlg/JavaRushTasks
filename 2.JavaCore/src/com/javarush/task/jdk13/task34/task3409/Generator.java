package com.javarush.task.jdk13.task34.task3409;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Generator<T> {

    private Class<T> aClass;

    public Generator(Class<T> aClass) {
        this.aClass = aClass;
    }

    T newInstance() throws Exception {
        Constructor<T> declaredConstructor = (Constructor<T>) aClass.getDeclaredConstructors()[0];
        Object[] objects = new Object[declaredConstructor.getParameterCount()];
        return declaredConstructor.newInstance(objects);
    }
}
