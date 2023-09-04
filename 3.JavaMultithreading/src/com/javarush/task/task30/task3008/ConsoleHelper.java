package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//вспомогательный класс, для чтения или записи в консоль.
public class ConsoleHelper {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String input = null;
        boolean incorrect = true;
        while (incorrect) {
            try {
                input = reader.readLine();
                incorrect = false;
            } catch (IOException e) {
                System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            }
        }
        return input;
    }

    public static int readInt() {
        int digital = 0;
        boolean incorrect = true;
        while (incorrect) {
            try {
                digital = Integer.parseInt(readString());
                incorrect = false;
            } catch (NumberFormatException e) {
                System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            }
        }
        return digital;
    }
}
