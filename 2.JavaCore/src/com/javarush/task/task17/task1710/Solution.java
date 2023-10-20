package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
   public static  SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c":
                Date date = simpleDate.parse(args[3]);
                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], date));
                } else {
                    allPeople.add(Person.createFemale(args[1], date));
                }
                System.out.println(allPeople.size() - 1);
                break;

            case "-r":
                int id = Integer.parseInt(args[1]);
                if (allPeople.get(id).getSex() == Sex.MALE) {
                    System.out.println(allPeople.get(id).getName() + " м " + simpleDateFormat.format(allPeople.get(id).getBirthDate()));
                } else {
                    System.out.println(allPeople.get(id).getName() + " ж " + simpleDateFormat.format(allPeople.get(id).getBirthDate()));
                }
                break;

            case "-u":
                int updateDataId = Integer.parseInt(args[1]);
                Date dateU = simpleDate.parse(args[4]);
                if (allPeople.get(updateDataId).getSex() == Sex.FEMALE) {
                    allPeople.set(updateDataId, Person.createMale(args[2], dateU));
                } else {
                    allPeople.set(updateDataId, Person.createFemale(args[2], dateU));
                }
                break;


            case "-d":
                int removeDataId = Integer.parseInt(args[1]);
                allPeople.get(removeDataId).setName(null);
                allPeople.get(removeDataId).setSex(null);
                allPeople.get(removeDataId).setBirthDate(null);
        }
    }
}

