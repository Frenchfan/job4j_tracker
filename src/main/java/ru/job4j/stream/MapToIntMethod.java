package ru.job4j.stream;

import java.util.List;

public class MapToIntMethod {
    /**
     * converting the object stream to a primitive and summing up the codes of the characters
     * pay attention to the (int) maptoInt method
     * @param characters
     * @return
     */
    public static long sum(List<Character> characters) {
        return characters.stream()
                .mapToInt(x -> (int) x)
                .sum();
    }
}
