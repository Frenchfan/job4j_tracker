package ru.job4j.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToAnyMap {
    /**
     * collecting a LinkedHashMap out of a stream, where keys are the elements, and values are elements ^ 2
     */
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(v -> v, k -> k * k, (prev, cur) -> prev, LinkedHashMap::new));
    }
}
