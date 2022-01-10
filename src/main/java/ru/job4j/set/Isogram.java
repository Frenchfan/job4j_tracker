package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        Set<String> letters = new HashSet<>();
        for (String letter: s.split("")) {
            letters.add(letter);
        }
        return letters.size() == s.length();
    }
}