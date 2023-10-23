package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) {

        // "/Users/dmitriy/Desktop/stream/test.txt"

        boolean encryptedDecrytped;
        switch (args[0]) {
            case "-e":
                encryptedDecrytped = true;
                encryptedDecrypted(args[1], args[2], encryptedDecrytped);
                break;
            case "-d":
                encryptedDecrytped = false;
                encryptedDecrypted(args[1], args[2], encryptedDecrytped);
        }
    }

    public static void encryptedDecrypted(String arg1, String arg2, boolean flag) {
        try (FileInputStream fileInputStream = new FileInputStream(arg1);
             FileOutputStream fileOutputStream = new FileOutputStream(arg2)) {
            while (fileInputStream.available() > 0) {
                if (flag) {
                    fileOutputStream.write(fileInputStream.read() * 2);
                } else {
                    fileOutputStream.write(fileInputStream.read() / 2);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
  /*try (FileInputStream fileInputStream = new FileInputStream(args[1]);
                     FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
                    while (fileInputStream.available() > 0) {
                        fileOutputStream.write(fileInputStream.read() * 2);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                 */

  /*try (FileInputStream fileInputStream = new FileInputStream(args[1]);
                     FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
                    while (fileInputStream.available() > 0) {
                        fileOutputStream.write(fileInputStream.read() / 2);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                 */