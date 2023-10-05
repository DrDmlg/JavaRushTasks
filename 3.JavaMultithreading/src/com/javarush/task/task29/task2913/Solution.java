package com.javarush.task.task29.task2913;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
Замена рекурсии
*/

public class Solution {
    private static int numberA;
    private static int numberB;

    public static String getAllNumbersBetween(int a, int b) {

        IntStream rangeStream = (a < b) ? IntStream.rangeClosed(a, b) : IntStream.rangeClosed(b, a);

        return rangeStream
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        Random random = new Random();
        numberA = random.nextInt(1000);
        numberB = random.nextInt(1000);
        System.out.println(getAllNumbersBetween(numberA, numberB));
        System.out.println(getAllNumbersBetween(numberB, numberA));
    }
}
