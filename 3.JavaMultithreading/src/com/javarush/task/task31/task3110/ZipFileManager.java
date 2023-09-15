package com.javarush.task.task31.task3110;

import java.nio.file.Path;

/**
 * Менеджер архива. Он будет совершать операции над файлом архива (файлом, который будет храниться на диске и иметь расширение zip)
 */

public class ZipFileManager {


    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }


    /**
     * @param source Путь к чему-то, что мы будем архивировать.
     */
    public void createZip(Path source) throws Exception {

    }
}
