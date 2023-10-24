package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            String fileName3 = reader.readLine();

            try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
                 FileInputStream fileInputStream1 = new FileInputStream(fileName2);
                 FileInputStream fileInputStream2 = new FileInputStream(fileName3)) {
                while (fileInputStream1.available() > 0) {
                    fileOutputStream.write(fileInputStream1.read());
                }
                while (fileInputStream2.available() > 0) {
                    fileOutputStream.write(fileInputStream2.read());
                }
            }
        }
    }








        /*

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file1 = console.readLine();
        String file2 = console.readLine();
        String file3 = console.readLine();


        try (BufferedReader reader = new BufferedReader(new FileReader(file2));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file1))) {
            while (reader.ready()) {
                String line = reader.readLine();
                writer.write(line);
            }
        }

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file3));
             BufferedWriter writer1 = new BufferedWriter(new FileWriter(file1, true))) {
            while (reader1.ready()) {
                String line1 = reader1.readLine();
                writer1.newLine();
                writer1.write(line1);
            }
        }
    }
}

        /*
        String file1 = "/Users/dmitriy/Desktop/stream/firstFile.txt";
        String file2 = "/Users/dmitriy/Desktop/stream/secondFile.txt";
        String file3 = "/Users/dmitriy/Desktop/stream/thirdFile.txt";

         */


       /* readerWriter(file2, file1);
        readerWriter(file3, file1);
    }

    private static void readerWriter(String read, String write) {
        try (BufferedReader reader = new BufferedReader(new FileReader(read));
             BufferedWriter writer = new BufferedWriter(new FileWriter(write, true))) {
            while (reader.ready()) {
                String line = reader.readLine();
                writer.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

        */


/*


 */
