package com.javarush.task.task27.task2712.ad;

import java.util.Objects;

public class AdvertisementStorage { //хранилище рекламных роликов

    private static AdvertisementStorage INSTANCE;

    private AdvertisementStorage() {
    }

    public static AdvertisementStorage getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new AdvertisementStorage();
        }
        return INSTANCE;
    }
}
