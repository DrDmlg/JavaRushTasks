package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.ConsoleHelper;
import com.javarush.task.task31.task3110.ZipFileManager;

import java.nio.file.Paths;

/**
 * Базовый класс для работы с архивом. От него будут наледоваться классы реализующие команды
 */

public abstract class ZipCommand implements Command {

    public ZipFileManager getZipFileManager() throws Exception {
        /**
         * /Users/dmitriy/Desktop/complete/testarchive.zip
         */
        ConsoleHelper.writeMessage("Введите полный путь, где вы хотите сохранить архив(с расширением .zip))");
        String path = ConsoleHelper.readString();
        return new ZipFileManager(Paths.get(path));
    }

}
