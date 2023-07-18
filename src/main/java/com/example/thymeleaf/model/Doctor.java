package com.example.thymeleaf.model;

public class Doctor {

    public int number;
    public String name;

    public Doctor() {
    }

    public Doctor(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}