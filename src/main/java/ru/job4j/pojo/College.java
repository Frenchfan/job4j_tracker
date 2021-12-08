package ru.job4j.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class College {
    public static void main(String[] args) throws ParseException {
        Student student = new Student();
        student.setFio("Petr Arsentev");
        student.setGroup(2);
        student.setAdmission(new Date(121, 2, 12));
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String formattedAdmission = formatter.format(student.getAdmission());
        System.out.println("Студент " + student.getFio() + ", группа " + student.getGroup() + ", зачислен "
                + formattedAdmission);
    }
}
