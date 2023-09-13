package com.javarush.task.task26.task2610;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
