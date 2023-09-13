package com.javarush.task.task30.task3008;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
//класс, отвечающий за пересылаемые сообдщения
public class Message implements Serializable {

    private final MessageType type;
    private final String data;

    public Message(MessageType type) {
        this.type = type;
        this.data = null;
    }

    public Message(MessageType type, String data) {
        this.type = type;
        this.data = data;
    }

    public MessageType getType() {
        return this.type;
    }

    public String getData() {
        return this.data;
    }
}
