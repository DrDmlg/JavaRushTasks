package com.javarush.task.jdk13.task43.task4307;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.Objects;

/* 
Шило на мыло
*/

public class Solution {

    public static void main(String[] args) {
        String[] array1 = {null, "hello", "ok", null, "bye"};

        printFirstNonNull(array1);
        System.out.println("----------");
        printDefaultValueIfNullObject(array1, "oops");
    }

    public static void printFirstNonNull(final String... values) {
        for (int i = 0; i < values.length; i++) {
            if (Objects.isNull(values[i])) {
                continue;
            }
            if (Objects.nonNull(values[i])) {
                System.out.println(values[i]);
                break;
            }
        }
        //System.out.println(ObjectUtils.firstNonNull(values));
//        Arrays.stream(values)
//                .filter(Objects::nonNull)
//                .findFirst()
//                .ifPresent(System.out::println);

    }


    public static void printDefaultValueIfNullObject(final String[] values, final String defaultValue) {

        for (String o : values) {
            System.out.println(Objects.requireNonNullElse(o, defaultValue));
        }

            //   System.out.println(ObjectUtils.defaultIfNull(o, defaultValue));
//        Arrays.stream(values)
//                .forEach(o -> System.out.println(Objects.requireNonNullElse(o, defaultValue)));
        }
    }

