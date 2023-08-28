package com.javarush.task.task29.task2909.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    String name;
    String surname;
    int age;

    @Getter(AccessLevel.NONE) // не генерирует геттер для этого поля
    @Setter(AccessLevel.NONE) // не генерирует сеттер для этого поля
    Work work;

    Address address;
    boolean man;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public String getCountry() {
        return address.getCountry();
    }

    public void setCountry(String country) {
        address.setCountry(country);
    }

    public String getCity() {
        return address.getCity();
    }

    public void setCity(String city) {
        address.setCity(city);
    }

    public String getAddress() {
        return getCountry() + " " + getCity() + " " + address.getHouse();
    }

    public boolean isMan() {
        return this.man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public void printInfo() {
        System.out.println("Имя: " + getName());
        System.out.println("Фамилия: " + getSurname());
    }

    public void printAdditionalInfo() {
        if (getAge() < 16)
            System.out.println("Пользователь моложе 16 лет");
        else
            System.out.println("Пользователь старше 16 лет");
    }

    public String getBoss() {
        return work.getBoss();
    }
}