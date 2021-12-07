package ru.job4j.inheritance;

public class Pacient {

    private String name;
    private int daysatHospital;

    public Pacient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int payStay() {
        return daysatHospital * 1250;
    }
}
