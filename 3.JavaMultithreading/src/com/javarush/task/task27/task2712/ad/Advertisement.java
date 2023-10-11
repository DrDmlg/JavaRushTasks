package com.javarush.task.task27.task2712.ad;

public class Advertisement {

    private Object content; // видео
    private String name;
    private long initialAmount; // начальная сумма, стоимость рекламы
    private int hits; //количество оплаченных показов
    private int duration; //продолжительность в секундах

    public Advertisement(Object content, String name, long initial, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initial;
        this.hits = hits;
        this.duration = duration;
    }
}
