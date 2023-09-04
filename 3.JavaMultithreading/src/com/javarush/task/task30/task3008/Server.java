package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        ConsoleHelper.writeMessage("Введите порт сервера");

        try (ServerSocket serverSocket = new ServerSocket(ConsoleHelper.readInt())) {
            ConsoleHelper.writeMessage("Сервер запущен");
            while (true) {
                Socket clientSocket = serverSocket.accept();////эта строка ожидает подключение клиента и создает новый сокет
                ConsoleHelper.writeMessage("Клиент " + clientSocket + " подключился к серверу");
                new Handler(clientSocket).start();
            }
        } catch (Exception e) {
            ConsoleHelper.writeMessage("Произошла ошибка при запуске или работе сервера.");
        }
    }

    public static void sendBroadcastMessage(Message message) {
        String data = message.getData();
        for (String key : connectionMap.keySet()) {
            Connection connection = connectionMap.get(key);
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Возникла ошибка при отправке сообщения.");
            }
        }
    }


    private static class Handler extends Thread {

        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {

        }
    }
}
