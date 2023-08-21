package com.javarush.task.task25.task2511;

import org.w3c.dom.ls.LSOutput;

import java.util.Timer;
import java.util.TimerTask;

/* 
Вооружаемся до зубов!
*/

public class Solution extends TimerTask {
    protected TimerTask original;
    protected final Thread.UncaughtExceptionHandler handler;

    public Solution(TimerTask original) {
        if (original == null) {
            throw new NullPointerException();
        }
        this.original = original;
        this.handler = new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                String name = t.getName();
                String name_star = name.replaceAll(".", "*");
                System.out.println(e.getMessage().replaceAll(name, name_star));
            }
        };    //init handler here
        Thread.currentThread().setUncaughtExceptionHandler(handler);
    }

    public void run() {
        try {
            original.run();
        } catch (Throwable cause) {
            Thread currentThread = Thread.currentThread();
            handler.uncaughtException(currentThread, new Exception("Blah " + currentThread.getName() + " blah-blah-blah", cause));
        }
    }

    public long scheduledExecutionTime() {
        return original.scheduledExecutionTime();
    }

    public boolean cancel() {
        return original.cancel();
    }

    public static void main(String[] args) {

        new Thread(new Solution(new TimerTask() {
            @Override
            public void run() {
                throw new Error();
            }
        })).start();
    }
}
