package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * keep the list without elements divisible by 4
 */
public class Task1 {
    public static List<Integer> retain(List<Integer> list) {
        return list.stream()
                .filter(x -> x % 4 != 0)
                .collect(Collectors.toList());
    }
}
