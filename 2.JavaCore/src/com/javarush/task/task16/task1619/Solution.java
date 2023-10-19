package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
*/

public class Solution {
    private static boolean isCancel =  true;
    public static void main(String[] args) throws InterruptedException {


        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(1000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        isCancel = false;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (isCancel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
