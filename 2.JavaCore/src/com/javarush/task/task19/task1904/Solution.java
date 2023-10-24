package com.javarush.task.task19.task1904;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(System.in);
        PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(scanner);
        System.out.println(personScannerAdapter.read());
    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String line = fileScanner.nextLine();
            String[] split = line.split(" ");
            String date = split[3] + " " + split[4] + " " + split[5];
            SimpleDateFormat sp = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            return new Person(split[1], split[2], split[0], sp.parse(date));

        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
