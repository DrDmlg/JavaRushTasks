package com.javarush.task.task28.task2805;


import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {

    private static volatile AtomicInteger nextPriorityIndex = new AtomicInteger(1);

    private synchronized void assignPriority() {
        setPriority(nextPriorityIndex.getAndIncrement());
        if (nextPriorityIndex.get() > MAX_PRIORITY) {
            nextPriorityIndex.set(1);
        }
    }

    public MyThread() {
        assignPriority();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        assignPriority();
    }

    public MyThread(Runnable target) {
        super(target);
        assignPriority();
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        assignPriority();
    }

    public MyThread(String name) {
        super(name);
        assignPriority();
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        assignPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        assignPriority();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        assignPriority();
    }
}

