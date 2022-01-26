package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * getting list of Integer out of int[]
 * Use boxed()
 */
public class BoxedMethod {
    public static List<Integer> boxed(int[] data) {
        return Arrays.stream(data)
                .boxed()
                .collect(Collectors.toList());
    }

}
