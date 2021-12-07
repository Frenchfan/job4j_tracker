package ru.job4j.inheritance;

import java.util.Date;

public class Engineer extends Profession {

    private int finishedProjects;

    public Engineer(String name, String surname, String education, Date birthday, int finishedProjects) {
        super(name, surname, education, birthday);
        this.finishedProjects = finishedProjects;
    }

    public int getFinishedProjects() {
        return finishedProjects;
    }

    public int calculateRate(int hours) {
        return hours * finishedProjects;
    }
}
