package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BotClient extends Client {

    public static void main(String[] args) {
        new BotClient().run();
    }

    @Override
    protected String getUserName() {
        return "date_bot_" + (int) (Math.random() * 100);
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    public class BotSocketThread extends SocketThread {

        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {

            SimpleDateFormat dateFormat = new SimpleDateFormat();
            Calendar calendar = Calendar.getInstance();

            ConsoleHelper.writeMessage(message);

            String[] split = message.split(":");
            String name = split[0].trim();
            String text = split[1].trim();

            String info = "Информация для " + name + ": ";

            switch (text) {
                case "дата":
                    dateFormat.applyPattern("d.MM.YYYY");
                    sendTextMessage(info + dateFormat.format(calendar.getTime()));
                    break;
                case "день":
                    dateFormat.applyPattern("d");
                    sendTextMessage(info + dateFormat.format(calendar.getTime()));
                    break;
                case "месяц":
                    dateFormat.applyPattern("MMMM");
                    sendTextMessage(info + dateFormat.format(calendar.getTime()));
                    break;
                case "год":
                    dateFormat.applyPattern("YYYY");
                    sendTextMessage(info + dateFormat.format(calendar.getTime()));
                    break;
                case "время":
                    dateFormat.applyPattern("H:mm:ss");
                    sendTextMessage(info + dateFormat.format(calendar.getTime()));
                    break;
                case "час":
                    dateFormat.applyPattern("H");
                    sendTextMessage(info + dateFormat.format(calendar.getTime()));
                    break;
                case "минуты":
                    dateFormat.applyPattern("m");
                    sendTextMessage(info + dateFormat.format(calendar.getTime()));
                    break;
                case "секунды":
                    dateFormat.applyPattern("s");
                    sendTextMessage(info + dateFormat.format(calendar.getTime()));
                    break;
            }
        }
    }
}