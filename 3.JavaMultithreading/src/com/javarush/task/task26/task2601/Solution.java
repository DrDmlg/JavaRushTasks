package com.javarush.task.task26.task2601;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;

/* 
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {

        Integer[] array = {13, 8, 15, 5, 17};
        Integer[] sort = sort(array);
        System.out.println(Arrays.toString(sort));
    }


    public static Integer[] sort(Integer[] array) {

        Arrays.sort(array);
        int median = array.length % 2 != 0 ? array[array.length / 2] : (array[(array.length / 2) - 1] + array[(array.length / 2)]) / 2;

        Arrays.sort(array, Comparator.comparingInt(value -> Math.abs(value - median)));

        return array;
    }
}
