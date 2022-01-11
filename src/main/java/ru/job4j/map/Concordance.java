package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> symbols = new HashMap<>();
        s = s.replaceAll(" ", "");
        for (int i = 0; i < s.length(); i++) {
            symbols.putIfAbsent(s.charAt(i), new ArrayList<>());
            symbols.get(s.charAt(i)).add(i);
        }
        return symbols;
    }
}