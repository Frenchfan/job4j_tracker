package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String line: strings) {
            String firstSymbol = String.valueOf(line.charAt(0));
            rsl.putIfAbsent(firstSymbol, new ArrayList<>());
            rsl.get(firstSymbol).add(line);
        }
        return rsl;
    }
}

