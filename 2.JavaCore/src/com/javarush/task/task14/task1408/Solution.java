package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();


    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals("Russia")) {
                return new RussianHen();
            } else if (country.equals("Ukraine")) {
                return new UkrainianHen();
            } else if (country.equals("Moldova")) {
                return new MoldovanHen();
            } else if (country.equals("Belarus")) {
                return new BelarusianHen();
            }
            return hen;
        }
    }
}
