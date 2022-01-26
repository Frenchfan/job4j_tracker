package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToList {
    /**
     * collects stream to an ArrayList
     * @param data - initial stream
     * @return collected List
     */
    public static List<Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toList());
    }
}
