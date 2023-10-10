package com.javarush.task.pro.task17.task1715;

import java.util.ArrayList;
import java.util.List;

/* 
Вилларибо и Виллабаджо.
*/

public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        orchestra.add(new Organ());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
        orchestra.add(new Piano());


    }

    public static void createStringedOrchestra() {
        orchestra.add(new Violin());
        orchestra.add(new Violin());
        orchestra.add(new Guitar());
    }

    public static void playOrchestra() {
        for (MusicalInstrument pair : orchestra) {
            if (pair instanceof Organ) {
                Organ organ = (Organ) pair;
                organ.play();
            } else if (pair instanceof Violin) {
                Violin violin = (Violin) pair;
                violin.play();
            } else if (pair instanceof Guitar) {
                Guitar guitar = (Guitar) pair;
                guitar.play();
            } else if (pair instanceof Piano) {
                Piano piano = (Piano) pair;
                piano.play();
            }
        }
    }
}
