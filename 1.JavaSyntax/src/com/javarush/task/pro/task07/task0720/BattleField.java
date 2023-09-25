package com.javarush.task.pro.task07.task0720;

/* 
Галавир XIII (5)
*/

public class BattleField {
    public static String nimrodDefence = "Вражеская атака отбита";
    public static String nimrodAttack = "Наносим контр удар";
    public static String nimrodDestroy = "Вражеский удар не выдержан";
    public static String galavirDefence = "Наша атака успешно отражена врагом";
    public static String galavirAttack = "Враг наносит удар";
    public static String galavirDestroy = "Вражеский корабль повержен";

    public static void main(String[] args) {
        GalavirXIII galavir = new GalavirXIII();
        Nimrod nimrod = new Nimrod();

        do {
            System.out.println(galavirAttack);
            nimrod.defend(galavir.attack());
            if (isNimrodAlive(nimrod)) {
                System.out.println(nimrodAttack);
                galavir.defend(nimrod.attack());
            } else {
                break;
            }
        } while (isGalavirAlive(galavir));
    }

    public static boolean isNimrodAlive(Nimrod nimrod) {
        if (nimrod.health > 0) {
            System.out.println(nimrodDefence);
            return true;
        } else {
            System.out.println(nimrodDestroy);
            return false;
        }
    }

    public static boolean isGalavirAlive(GalavirXIII galavir) {
        if (galavir.health > 0) {
            System.out.println(galavirDefence);
            return true;
        } else {
            System.out.println(galavirDestroy);
            return false;
        }
    }
}
