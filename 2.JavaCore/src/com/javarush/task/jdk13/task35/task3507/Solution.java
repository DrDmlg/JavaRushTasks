package com.javarush.task.jdk13.task35.task3507;

import java.nio.file.Files;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* 
Collections & Generics
*/

public class Solution {

    public static void main(String[] args) {



    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        return new HashSet<>(Arrays.asList(elements));
    }

    public static <K, V> HashMap<K, V> newHashMap(List<K> keys, List<V> values) {
        HashMap<K, V> hashMap = new HashMap<>();

        if (keys.size() == values.size()) {

            IntStream.range(0, keys.size())
                    .forEach(i -> hashMap.put(keys.get(i), values.get(i)));

        } else {
            throw new IllegalArgumentException();
        }
        return hashMap;
    }
}

