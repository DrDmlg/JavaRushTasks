package com.javarush.task.task30.task3008;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketAddress;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
//Класс соединения между клиентом и сервером
public class Connection implements Closeable {

    Socket socket;
    ObjectOutputStream out;
    ObjectInputStream in;

    public Connection(Socket socket) throws IOException {
        this.socket = socket;
        this.out = new ObjectOutputStream(socket.getOutputStream());
        this.in = new ObjectInputStream(socket.getInputStream());
    }

    public void send(Message message) throws IOException {
        synchronized (this.out) {
            out.writeObject(message);
        }
    }

    public Message receive() throws IOException, ClassNotFoundException {
        synchronized (this.in) {
            return (Message) in.readObject();
        }
    }

    public SocketAddress getRemoteSocketAddress() {
        return socket.getRemoteSocketAddress();
    }

    @Override
    public void close() throws IOException {
        try (Socket socketToClose = socket;
             ObjectInputStream inToClose = in;
             ObjectOutputStream outToClose = out) {
        }
    }
}
