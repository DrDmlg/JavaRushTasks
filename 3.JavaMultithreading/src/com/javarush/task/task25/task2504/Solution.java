package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/

import java.util.Arrays;

public class Solution extends Thread {
    public static void processThreads(Thread... threads) {
        for (Thread thread : threads) {
            switch (thread.getState()) {
                case NEW:
                    thread.start();
                    break;
                case WAITING:
                case TIMED_WAITING:
                case BLOCKED:
                    thread.interrupt();
                    break;
                case RUNNABLE:
                    thread.isInterrupted();
                    break;
                    case TERMINATED:
                    System.out.println(thread.getPriority());
                    break;
            }
        }
    }
    //implement this method - реализуйте этот метод


    public static void main(String[] args) {

    }
}
