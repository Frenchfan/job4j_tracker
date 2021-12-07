package ru.job4j.inheritance;

import java.util.Date;

public class Doctor extends Profession {

    private int yearsofPractice;

    public Doctor(String name, String surname, String education, Date birthday, int yearsofPractice) {
        super(name, surname, education, birthday);
        this.yearsofPractice = yearsofPractice;
    }

    public int getYearsofPractice() {
        return yearsofPractice;
    }

    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis("Malaria");
    }
}
