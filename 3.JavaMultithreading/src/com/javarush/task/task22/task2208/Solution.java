package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);

        String result = getQuery(map);
        System.out.println(result);
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String pair : params.keySet()) {
            if (params.get(pair) == null) continue;
            if(stringBuilder.toString().length() != 0){
                stringBuilder.append(" and ");
            }
            stringBuilder.append(pair + " = '" + params.get(pair) + "'");
        }
        return stringBuilder.toString();
    }
}

