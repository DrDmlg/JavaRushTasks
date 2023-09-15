package com.javarush.task.task31.task3110;

import javax.imageio.stream.ImageInputStream;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Главный класс приложения "Архиватор"
 */

public class Archiver {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите полный путь архива в который сохранятся сжатые файлы: ");
        ZipFileManager fileManager = new ZipFileManager(Paths.get(reader.readLine()));

        System.out.println("Введите путь к файлу который необходимо архивировать");
        fileManager.createZip(Paths.get(reader.readLine()));
    }
}
