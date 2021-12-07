package ru.job4j.inheritance;

import java.util.Date;

public class Programmer extends Engineer {

    private String language;

    public Programmer(String name, String surname, String education, Date birthday, int finishedProjects, String language) {

        super(name, surname, education, birthday, finishedProjects);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void proceedTask(Task task) { }
}
