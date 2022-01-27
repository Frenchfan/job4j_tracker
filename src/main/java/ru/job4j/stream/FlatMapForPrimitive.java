package ru.job4j.stream;

import java.util.Arrays;

/**
 * get the sum of the matrix elements
 */
public class FlatMapForPrimitive {
    public static int sum(int[][] matrix) {
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sum();
    }
}
