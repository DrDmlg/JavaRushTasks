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

        connectionMap.forEach((key, connection) -> {
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Возникла ошибка при отправке сообщения.");
            }
        });
    }


    private static class Handler extends Thread {

        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                serverHandshake(new Connection(socket));
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {

            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message message = connection.receive();

                if (message.getType() != MessageType.USER_NAME) {
                    continue;
                }

                if (message.getData().equals("")) {
                    continue;
                }

                if (!connectionMap.containsKey(message.getData())) {
                    connectionMap.put(message.getData(), connection);
                    connection.send(new Message(MessageType.NAME_ACCEPTED));
                    return message.getData();
                }
            }
        }
    }
}



/*
 private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            String userName = "";
            while (true) {
                connection.send(new Message(MessageType.USER_NAME, "Введите имя пользователя"));
                Message message = connection.receive();
                if (message.getType() == MessageType.USER_NAME) {
                    userName = message.getData();
                    ConsoleHelper.writeMessage(userName + " Возможно имя пустое");
                }
                if ((!userName.equals("") && (!connectionMap.containsKey(userName)))) {
                    connectionMap.put(userName, connection);
                    connection.send(new Message(MessageType.USER_NAME, "Ваше имя принято!"));
                }
                return userName;
            }
        }
    }
}
 */

  /* for (String key : connectionMap.keySet()) {
            Connection connection = connectionMap.get(key);
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Возникла ошибка при отправке сообщения.");
            }
        }

         */