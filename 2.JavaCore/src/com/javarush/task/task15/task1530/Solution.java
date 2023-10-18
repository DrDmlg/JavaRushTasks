package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {

        DrinkMaker latteMaker = new LatteMaker();

        latteMaker.getRightCup();
        latteMaker.putIngredient();
        latteMaker.pour();
    }
}
