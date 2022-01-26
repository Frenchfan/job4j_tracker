package ru.job4j.stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMapWhenDublicate {
    /**
     * collect the data to a map with elements as keys, values - elements ^ 2,
     * keep the previous in case of duplicated keys
     * @param data stream
     * @return map with no duplicates
     */
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(
                Collectors.toMap(k -> k, v -> v * v, (prev, cur) -> prev));
    }
}
