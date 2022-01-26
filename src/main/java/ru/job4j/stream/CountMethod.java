package ru.job4j.stream;

import java.util.stream.Stream;

public class CountMethod {
    /**
     * Counting elements in the stream
     * @param data original stream
     * @return amount of elements
     */
    public static long count(Stream<Integer> data) {
        return data.count();
    }
}
