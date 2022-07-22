package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        double sum = 0, count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.getSubjects()) {
                sum += subject.getScore();
                count++;
            }
        }
        return sum / count;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        double sum, count;
        List<Label> rsl = new ArrayList<>();
        List<Subject> subjectList = new ArrayList<>();
        HashSet<String> subjectNamesList = new HashSet<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.getSubjects()) {
                subjectList.add(subject);
                subjectNamesList.add(subject.getName());
            }
        }
        for (String subjectName : subjectNamesList) {
            sum = 0;
            count = 0;
            for (Subject subject : subjectList) {
                if (subject.getName().equals(subjectName)) {
                    sum += subject.getScore();
                    count++;
                }
            }
            rsl.add(new Label(subjectName, sum / count));
        }
        return rsl;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        double sum, count;
        List<Label> rsl = new ArrayList<>();
        for (Pupil pupil : pupils) {
            sum = 0;
            count = 0;
            for (Subject subject : pupil.getSubjects()) {
                sum += subject.getScore();
                count++;
            }
            rsl.add(new Label(pupil.getName(), sum / count));
        }
        return rsl;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        Label bestStudent = new Label("", 0);
        double sum;
        for (Pupil pupil : pupils) {
            sum = 0;
            for (Subject subject : pupil.getSubjects()) {
                sum += subject.getScore();
            }
            if (bestStudent.score() < sum) {
                bestStudent = new Label(pupil.getName(), sum);
            }
        }
        return bestStudent;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Label bestSubject = null;
        HashMap<String, Integer> scoresBySubject = new HashMap<>();
        double sum;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.getSubjects()) {
                if (scoresBySubject.containsKey(subject.getName())) {
                    scoresBySubject.put(subject.getName(), scoresBySubject.get(subject.getName()) + subject.getScore());
                } else {
                    scoresBySubject.put(subject.getName(), subject.getScore());
                }
            }
        }
        for (String subjName : scoresBySubject.keySet()) {
            sum = scoresBySubject.get(subjName);
            if (bestSubject == null || bestSubject.score() < sum) {
                bestSubject = new Label(subjName, sum);
            }
        }
        return bestSubject;
    }

}