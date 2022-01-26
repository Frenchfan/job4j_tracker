package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Transform the stream with chars() to the stream Charater and collect to a List.
 * IntStream will contain symbols. To transform to character use the method:
 * Charater c = (char) 91;
 */
public class CharsMethod {
    public static List<Character> symbols(String string) {
        return string.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.toList());
    }
}
