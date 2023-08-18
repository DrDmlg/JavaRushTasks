package com.javarush.task.task25.task2509;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

public abstract class SocketTask<T> implements CancellableTask<T> {
    private Socket socket;

    protected synchronized void setSocket(Socket socket) {
        this.socket = socket;
    }

    public synchronized void cancel() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public RunnableFuture<T> newTask() {
        return new FutureTask<T>(this) {
            public boolean cancel(boolean mayInterruptIfRunning) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    super.cancel(mayInterruptIfRunning);
                }
                //close all resources here by using proper SocketTask method
                //call super-class method in finally block
                return false;
            }
        };
    }
}