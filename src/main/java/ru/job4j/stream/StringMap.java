package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * adds ".java" to each line
 */
public class StringMap {
    public static List<String> map(List<String> names) {
       return names.stream()
                .map(x -> x + ".java")
                .collect(Collectors.toList());
    }
}
