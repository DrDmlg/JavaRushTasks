package com.javarush.task.task29.task2909.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Address {

    private String country;
    private String city;
    private String house;
}
