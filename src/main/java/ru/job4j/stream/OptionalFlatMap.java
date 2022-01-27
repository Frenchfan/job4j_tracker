package ru.job4j.stream;

import java.util.List;
import java.util.Optional;

/**
 * find the first line, which ends with ".java" and return Optional out of the length of the line
 */
public class OptionalFlatMap {
    public static Optional<Integer> flatMap(List<String> strings) {
        return strings.stream()
                .filter(x -> x.endsWith(".java"))
                .findFirst()
                .flatMap(x -> Optional.of(x.length()));
    }
}
