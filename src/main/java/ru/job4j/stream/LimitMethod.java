package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * keep the first 3 elements of the list only
 */
public class LimitMethod {
    public static List<String> firstThree(List<String> strings) {
        return strings.stream()
                .limit(3)
                .collect(Collectors.toList());
    }
}
