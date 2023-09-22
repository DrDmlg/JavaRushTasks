package com.javarush.task.task31.task3110;

/**
 * Класс, отвечающий за свойства(метаинформацию) каждого файла в архиве.
 */
public class FileProperties {

    private String name;
    private long size;
    private long compressedSize;
    private int compressionMethod;

    public FileProperties(String name, long size, long compressedSize, int compressionMethod) {
        this.name = name;
        this.size = size;
        this.compressedSize = compressedSize;
        this.compressionMethod = compressionMethod;
    }


    public static void main(String[] args) {
        FileProperties fileProperties = new FileProperties("file", 700L, 566L, 66);
        System.out.println(fileProperties);
    }

    public long getCompressionRatio() {
        return 100 - ((getCompressedSize() * 100) / getSize());
    }


//    @Override
//    public String toString() {
//        return size > 0 ? String.format("%s %d Kb (%d Kb) сжатие: %d%%", name, size / 1024, compressedSize / 1024, getCompressionMethod()) : name;
//    }

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


    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public long getCompressedSize() {
        return compressedSize;
    }

    public int getCompressionMethod() {
        return compressionMethod;
    }
}
