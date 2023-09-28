package com.javarush.task.task28.task2807;

import java.util.concurrent.*;

/* 
Знакомство с ThreadPoolExecutor
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {

        LinkedBlockingQueue<Runnable> runnables = new LinkedBlockingQueue<>();

        ThreadPoolExecutor tpe = new ThreadPoolExecutor(3,
                5,
                1000,
                TimeUnit.MILLISECONDS,
                runnables);

        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            runnables.add(() -> doExpensiveOperation(finalI));
        }

        tpe.prestartAllCoreThreads();
        tpe.shutdown();
        tpe.awaitTermination(5, TimeUnit.SECONDS);
    }

    private static void doExpensiveOperation(int localId) {
        System.out.println(Thread.currentThread().getName() + ", localId=" + localId);
    }
}
