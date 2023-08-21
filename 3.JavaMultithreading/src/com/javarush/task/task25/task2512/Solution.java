package com.javarush.task.task25.task2512;

import java.util.*;

/* 
Живем своим умом
*/

public class Solution implements Thread.UncaughtExceptionHandler {


    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        Deque<Throwable> stack = new ArrayDeque<>();

        while (e != null) {
            stack.push(e);
            e = e.getCause();
        }

        for (Throwable tThrowable : stack) {
            System.out.println(tThrowable.getClass().getName() + ": " + tThrowable.getMessage());
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Thread thread = new Thread(() -> {
            new Solution().uncaughtException(new Thread(), new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
        });
        thread.setUncaughtExceptionHandler(solution);
        thread.start();
    }
}
