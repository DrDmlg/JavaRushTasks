package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        ConsoleHelper.writeMessage("Введите порт сервера");
        try (ServerSocket serverSocket = new ServerSocket(ConsoleHelper.readInt())) {
            ConsoleHelper.writeMessage("Сервер запущен");
            while (true) {
                Socket clientSocket = serverSocket.accept();//эта строка ожидает подключение клиента и создает новый сокет
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
            ConsoleHelper.writeMessage("Установлено соединение с удаленным адресом " + socket.getRemoteSocketAddress());

            String userName = null;
            try (Connection connection = new Connection(socket)) {
                userName = serverHandshake(connection);

                // Сообщаем всем участникам, что присоединился новый участник
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));

                // Сообщаем новому участнику о существующих участниках
                notifyUsers(connection, userName);

                // Обрабатываем сообщения пользователей
                serverMainLoop(connection, userName);

            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Ошибка при обмене данными с " + socket.getRemoteSocketAddress());
            }

            if (userName != null) {
                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
            }
                ConsoleHelper.writeMessage("Cоединение с удаленным адресом " + socket.getRemoteSocketAddress() + " закрыто.");
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException { //протокол проверки клиента

            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST, "Введите свое имя"));
                Message message = connection.receive();

                if (message.getType() != MessageType.USER_NAME) {
                    continue;
                }

                if (message.getData().equals("")) {
                    connection.send(new Message(MessageType.NAME_REQUEST, "Вы не ввели имя! Попробуйте еще раз"));
                    continue;
                }

                if (!connectionMap.containsKey(message.getData())) {
                    connectionMap.put(message.getData(), connection);
                    connection.send(new Message(MessageType.NAME_ACCEPTED, "Вы были успешно добавлены в чат"));
                    return message.getData();
                }
            }
        }

        private void notifyUsers(Connection connection, String userName) throws IOException { //отправка новому пользователю о существующих участиков в чате
            for (String name : connectionMap.keySet()) {
                if (!name.equals(userName)) connection.send(new Message(MessageType.USER_ADDED, name));
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException { //проверка, что пользователь ввел текст
            while (true) {
                Message message = connection.receive();

                if (message.getType() == MessageType.TEXT) {
                    String data = message.getData();
                    sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + data));
                } else {
                    ConsoleHelper.writeMessage("Получено сообщение от " + socket.getRemoteSocketAddress() + ". Тип сообщения не соответствует протоколу.");
                }
            }
        }
    }
}


