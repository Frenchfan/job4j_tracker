package ru.job4j.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        String[] splitted = s.split("");
        List<String> characters = new ArrayList<>(List.of(splitted));
        characters.sort(new ABCcompare());
        StringBuilder newLine = new StringBuilder();
        for (String b: characters) {
            newLine.append(b);
        }
        return newLine.toString();
    }

    static class ABCcompare implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
}