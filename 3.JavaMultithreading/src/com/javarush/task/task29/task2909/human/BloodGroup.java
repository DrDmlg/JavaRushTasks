package com.javarush.task.task29.task2909.human;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class BloodGroup {

    int code;

    public static BloodGroup first() {
        return new BloodGroup(1);
    }

    public static BloodGroup second() {
        return new BloodGroup(2);
    }

    public static BloodGroup third() {
        return new BloodGroup(3);
    }

    public static BloodGroup fourth() {
        return new BloodGroup(4);
    }
}
