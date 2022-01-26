package ru.job4j.stream;

import java.util.stream.Stream;

public class ForEachMethod {
    /**
     * print the stream elements in the console
     * @param data initial stream
     */
    public static void show(Stream<Integer> data) {
        data.forEach(System.out::println);
    }
}
