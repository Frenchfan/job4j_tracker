package ru.job4j.inheritance;

import java.util.Date;

public class Surgeon extends Doctor {

    private int lethalCases;

    public Surgeon(String name, String surname, String education, Date birthday, int yearsofPractice, int lethalCases) {
        super(name, surname, education, birthday, yearsofPractice);
        this.lethalCases = lethalCases;
    }

    public int getLethalCases() {
        return lethalCases;
    }

    public void operation(Pacient pacient) { }
}
