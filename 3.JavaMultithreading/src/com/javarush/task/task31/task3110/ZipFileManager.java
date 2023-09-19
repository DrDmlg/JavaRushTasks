package com.javarush.task.task31.task3110;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

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

        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(zipFile));
             InputStream inputStream = Files.newInputStream(source)) {

            zipStream.putNextEntry(new ZipEntry(source.getFileName().toString())); //Добавляем в поток архива созданный элемент архива

            while (inputStream.available() > 0) {
                zipStream.write(inputStream.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
