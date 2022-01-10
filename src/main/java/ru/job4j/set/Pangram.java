package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        Set<String> letters = new HashSet<>();
        String[] letter = s.trim().split("");
        for (String symbol: letter) {
            letters.add(symbol);
        }
        return letters.size() >= 26;
    }
}