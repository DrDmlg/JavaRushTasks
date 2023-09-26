package com.javarush.task.jdk13.task38.task3801;

import lombok.Getter;

@Getter
public class IncorrectAccount {
    @LongPositive
    private String amountString;
}