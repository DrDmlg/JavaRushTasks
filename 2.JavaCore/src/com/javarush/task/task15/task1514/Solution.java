package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
       labels.put(1d, "Dmitriy");
       labels.put(2d, "Dmitriy");
       labels.put(3d, "Dmitriy");
       labels.put(4d, "Dmitriy");
       labels.put(5d, "Dmitriy");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
