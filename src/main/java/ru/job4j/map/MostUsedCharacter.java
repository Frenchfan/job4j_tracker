package ru.job4j.map;

import java.util.*;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        Map<Character, Integer> symbols = new TreeMap<>();
        String newLine = str.replace(" ", "").toLowerCase();
        int maxFrequency = 0;
        char rsl = ' ';
        for (char myChar: newLine.toCharArray()) {
            symbols.computeIfPresent(myChar, (k, value) -> symbols.get(myChar) + 1);
            symbols.putIfAbsent(myChar, 1);
            if (symbols.get(myChar) > maxFrequency) {
                maxFrequency = symbols.get(myChar);
                rsl = myChar;
            }
        }
        return rsl;
    }
}