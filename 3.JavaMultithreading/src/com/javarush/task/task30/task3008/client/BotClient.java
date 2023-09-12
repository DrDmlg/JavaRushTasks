package com.javarush.task.task30.task3008.client;

public class BotClient extends Client {

    public static void main(String[] args) {
        new BotClient().run();
    }


    @Override
    protected String getUserName() {
        return "date_bot_" +  (int) (Math.random() * 100);
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
    }

}
