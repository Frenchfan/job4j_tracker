package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * get elements ^2 using map
 */
public class NumberMap {
    public static List<Integer> map(List<Integer> numbers) {
        return numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }
}
