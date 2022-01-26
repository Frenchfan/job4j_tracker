package ru.job4j.stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collect the stream to a map with elements as keys and element * element as values
 */
public class CollectToMap {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(
                Collectors.toMap(k -> k, k -> k * k)
        );
    }
}
