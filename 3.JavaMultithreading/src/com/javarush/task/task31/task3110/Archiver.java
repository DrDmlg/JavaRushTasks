package com.javarush.task.task31.task3110;


import com.javarush.task.task31.task3110.command.ExitCommand;

import java.io.*;
import java.nio.file.Paths;

/**
 * Главный класс приложения "Архиватор"
 */

public class Archiver {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите полный путь файла архива: "); // полный путь к архиву с которым работаем
        ZipFileManager fileManager = new ZipFileManager(Paths.get(reader.readLine()));

        System.out.println("Введите путь к файлу который необходимо архивировать: "); //относительный путь
        fileManager.createZip(Paths.get(reader.readLine()));

        ExitCommand exit = new ExitCommand();
        exit.execute();
    }
}
