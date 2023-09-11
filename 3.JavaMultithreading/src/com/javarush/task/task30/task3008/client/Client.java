package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;
import java.util.Scanner;

public class Client {

    protected Connection connection;
    private volatile boolean clientConnected;

//    public static void main(String[] args) { // удалить
//        System.out.println(getServerAddress());
//        System.out.println(getServerPort());
//        System.out.println(getUserName());
//    }

    //static у методов удалить

    protected String getServerAddress() { //запрос ввода адреса сервера у пользователя
        ConsoleHelper.writeMessage("Введите ip-адрес сервера:");
        return ConsoleHelper.readString();
    }

    protected int getServerPort() {
        ConsoleHelper.writeMessage("Введите порт сервера:");
        return ConsoleHelper.readInt();
    }

    protected String getUserName() {
        ConsoleHelper.writeMessage("Введите ваше имя:");
        return ConsoleHelper.readString();
    }

    public class SocketThread extends Thread {

        protected SocketThread getSocketThread() {
            return new SocketThread();
        }

        protected void sendTextMessage(String text) {
            try {
                connection.send(new Message(MessageType.TEXT, text));
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Не удалось отправить сообщение");
                clientConnected = false;
            }
        }

        protected boolean shouldSendTextFromConsole() {
            return true;
        }
    }
}



