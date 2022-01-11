package ru.job4j.map;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> rsl = new HashMap<>();
        for (String line: strings) {
            rsl.computeIfPresent(line, (s, b) -> true);
            rsl.putIfAbsent(line, false);
        }
        return rsl;
    }
}