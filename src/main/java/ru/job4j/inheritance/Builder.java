package ru.job4j.inheritance;

import java.util.Date;

public class Builder extends Engineer {

    private int ratepermeter;

    public Builder(String name, String surname, String education, Date birthday, int finishedProjects, int ratepermeter) {
        super(name, surname, education, birthday, finishedProjects);
        this.ratepermeter = ratepermeter;
    }

    public int getRatepermeter() {
        return ratepermeter;
    }

    public void buildHouse(int hours) { }
}
