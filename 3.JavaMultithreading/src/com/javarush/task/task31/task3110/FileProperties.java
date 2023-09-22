package com.javarush.task.task31.task3110;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
public class FileProperties {
    String name;
    long size;
    long compressedSize;
    int compressionMethod;

    public long getCompressionRatio() {
        // Вычисляем степень сжатия
        return 100 - ((compressedSize * 100) / size);
    }

    @Override
    public String toString() {
        // Строим красивую строку из свойств
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        if (size > 0) {
            builder.append("\t");
            builder.append(size / 1024);
            builder.append(" Kb (");
            builder.append(compressedSize / 1024);
            builder.append(" Kb) сжатие: ");
            builder.append(getCompressionRatio());
            builder.append("%");
        }
        return builder.toString();
    }
}
