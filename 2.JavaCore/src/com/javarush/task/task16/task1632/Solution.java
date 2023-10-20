package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());

    }

    public static void main(String[] args) {
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).start();
        }
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
                try {
                    throw new InterruptedException();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {

        public void showWarning() {
            this.interrupt();
        }

        public void run() {
            while (!isInterrupted()) {
            }
        }
    }

    public static class Thread5 extends Thread {
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            while (true) {
                try {
                    String str = reader.readLine();
                    if (str.equals("N"))
                        break;
                    sum += Integer.parseInt(str);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.print(sum);
        }
    }
}
