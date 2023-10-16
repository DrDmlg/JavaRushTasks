package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {

    private static final BufferedReader CONSOLE = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String pathName = CONSOLE.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(pathName));


        String line;
        do {
            line = CONSOLE.readLine();
            bw.write(line + System.lineSeparator());
        } while (!(line.equals("exit")));

        bw.close();






        /*boolean isExit = true;

        while (isExit) {
            String line = CONSOLE.readLine();
            bw.write(line + System.lineSeparator());
            if (line.equals("exit")){
                isExit = false;
            }
        }
        bw.close();

         */


       /* String line;
        while (!(line = CONSOLE.readLine()).equals("exit")) {
           bw.write(line + System.lineSeparator());
        }
        bw.close();

        */
    }
}
