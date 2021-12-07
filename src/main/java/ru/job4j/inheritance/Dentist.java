package ru.job4j.inheritance;

import java.util.Date;

public class Dentist extends Doctor {

    private int averageBill;

    public Dentist(String name, String surname, String education, Date birthday, int yearsofPractice, int averageBill) {
        super(name, surname, education, birthday, yearsofPractice);
        this.averageBill = averageBill;
    }

    public int getAverageBill() {
        return averageBill;
    }

    public void checkup(Pacient pacient) { }
}
