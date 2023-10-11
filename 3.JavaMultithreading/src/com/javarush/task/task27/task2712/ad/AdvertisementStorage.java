package com.javarush.task.task27.task2712.ad;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AdvertisementStorage { //хранилище рекламных роликов

    private static AdvertisementStorage INSTANCE;
    private final List<Advertisement> videos = new ArrayList<>();

    private AdvertisementStorage() {
        Object someContent = new Object();
        videos.add(new Advertisement(someContent, "First Video", 5000, 100, 3 * 60)); // 3 min
        videos.add(new Advertisement(someContent, "Second Video", 100, 10, 15 * 60)); //15 min
        videos.add(new Advertisement(someContent, "Third Video", 400, 2, 10 * 60));  //10 min
    }

    public static AdvertisementStorage getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new AdvertisementStorage();
        }
        return INSTANCE;
    }

    public List<Advertisement> list() {
        return videos;
    }

    public void add(Advertisement advertisement) {
        videos.add(advertisement);
    }
}
