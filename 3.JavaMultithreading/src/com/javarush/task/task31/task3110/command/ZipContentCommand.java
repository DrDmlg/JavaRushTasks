package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.ConsoleHelper;
import com.javarush.task.task31.task3110.FileProperties;
import com.javarush.task.task31.task3110.ZipFileManager;

import java.util.List;

/**
 * Класс реализующий команду просмотра содержимого архива
 */
public class ZipContentCommand extends ZipCommand {

    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Просмотр содержимого архива.");
        ZipFileManager fileManager = getZipFileManager();

        ConsoleHelper.writeMessage("Содержимое архива:");
        List<FileProperties> filesList = fileManager.getFilesList();

        filesList.forEach(System.out::println);

        ConsoleHelper.writeMessage("Содержимое архива прочитано.");
    }
}
