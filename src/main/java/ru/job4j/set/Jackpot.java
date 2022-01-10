package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> comb = new HashSet<>();
        for (String s: combination) {
            comb.add(s);
        }
        return comb.size() == 1;
    }
}