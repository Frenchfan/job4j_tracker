package ru.job4j.stream;

import java.util.stream.IntStream;

/**
 * Creates a stream of primitives (int) within an enclosed (including the start and end) range
 */
public class RangeMethod {
    public static IntStream createStream(int start, int end) {
        return IntStream.rangeClosed(start, end);
    }
}
