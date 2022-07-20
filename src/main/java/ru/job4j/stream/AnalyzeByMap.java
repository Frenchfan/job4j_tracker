package ru.job4j.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class AnalyzeByMap {

    public static double averageScore(List<Pupil> list) {
        return list.stream()
                .flatMap(pupil -> pupil.getSubjects()
                        .stream())
                        .mapToInt(Subject::getScore)
                        .average()
                        .orElse(0D);
    }

    public static List<Label> averageScoreByPupil(List<Pupil> list) {
        return list.stream()
                .map(pupil -> new Label(pupil.getName(), pupil.getSubjects()
                        .stream()
                        .mapToDouble(Subject::getScore)
                        .average()
                        .orElse(0D)))
                .collect(Collectors.toList());
    }

    public static List<Label> averageScoreBySubject(List<Pupil> list) {
        return list.stream()
                .flatMap(pupil -> pupil.getSubjects()
                        .stream())
                .collect(Collectors
                        .groupingBy(Subject::getName,
                                LinkedHashMap::new,
                                Collectors.averagingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(pupil -> new Label(pupil.getKey(), pupil.getValue()))
                .collect(Collectors.toList());
    }

    public static Label bestStudent(List<Pupil> list) {
        return list.stream()
                .map(pupil -> new Label(pupil.getName(), pupil.getSubjects()
                        .stream()
                        .mapToInt(Subject::getScore)
                        .sum()))
                .max(Label::compareTo)
                .orElse(new Label("", 0D));
    }

    public static Label bestSubject(List<Pupil> list) {
        return list.stream()
                .flatMap(pupil -> pupil.getSubjects()
                        .stream())
                .collect(Collectors
                        .groupingBy(Subject::getName,
                                Collectors.summingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(pupil -> new Label(pupil.getKey(), pupil.getValue()))
                .max(Label::compareTo)
                .orElse(new Label("", 0D));
    }
}