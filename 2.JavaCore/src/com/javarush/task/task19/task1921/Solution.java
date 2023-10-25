package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String name = line.replaceAll("\\d+", " ").trim();
                String date = line.replaceAll("\\D+", " ").trim();
               PEOPLE.add(new Person(name, simpleDateFormat.parse(date)));
            }
        }
    }
}
