package ru.job4j.stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * collect elements of the sublists in one list
 */
public class FlatMapForObject {
    public static List<Integer> flatMap(List<List<Integer>> lists) {
        return lists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
