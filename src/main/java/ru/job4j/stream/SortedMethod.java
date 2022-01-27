package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * get the list of sorted lines
 */
public class SortedMethod {
    public static List<String> sorted(List<String> strings) {
        return strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
