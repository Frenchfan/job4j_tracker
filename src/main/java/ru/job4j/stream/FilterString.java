package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * combining several .filter to filter elements
 * which start with "A" and end with ".java"
 */
public class FilterString {
    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(x -> x.startsWith("A"))
                .filter(x -> x.endsWith(".java"))
                .collect(Collectors.toList());
    }
}
