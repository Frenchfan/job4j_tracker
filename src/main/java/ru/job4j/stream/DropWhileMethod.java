package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * keep positive numbers only, the initial list is not sorted
 */
public class DropWhileMethod {
    public static List<Integer> dropWhile(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .dropWhile(x -> x < 0)
                .collect(Collectors.toList());
    }
}
