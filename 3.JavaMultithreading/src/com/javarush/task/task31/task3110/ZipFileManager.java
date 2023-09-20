package com.javarush.task.task31.task3110;

import com.javarush.task.task31.task3110.exception.PathIsNotFoundException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
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

        Path parentDirectory = zipFile.getParent();

        if (Files.notExists(parentDirectory)) Files.createDirectories(parentDirectory);

        ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(zipFile));

        if (Files.isDirectory(source)) {
            FileManager fileManager = new FileManager(source);
            List<Path> fileNames = fileManager.getFileList();
            for (Path fileName : fileNames) {
                addNewZipEntry(zipStream, source, fileName);
            }
        } else if (Files.isRegularFile(source)) {
            addNewZipEntry(zipStream, source.getParent(), source.getFileName());
        } else {
            throw new PathIsNotFoundException();
        }
    }


    private void addNewZipEntry(ZipOutputStream zipOutputStream, Path filePath, Path fileName) throws Exception {
        Path fullPath = filePath.resolve(fileName);
        try (InputStream inputStream = Files.newInputStream(fullPath)) {
            zipOutputStream.putNextEntry(new ZipEntry(fileName.toString())); //Добавляем в поток архива созданный элемент архива
            copyData(inputStream, zipOutputStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            zipOutputStream.closeEntry();
        }
    }

    private void copyData(InputStream in, OutputStream out) throws Exception {
        while (in.available() > 0) {
            out.write(in.read());
        }
    }
}
