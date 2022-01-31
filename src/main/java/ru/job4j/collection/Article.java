package ru.job4j.collection;

import java.util.*;

/**
 * Check that the line is made up only of the words from the origin
 */
public class Article {
    public static boolean generateBy(String origin, String line) {
        Set<String> originalWords = new HashSet<>(List.of(origin.split("\\p{Punct}|\\p{Space}")));
        Set<String> generatedWords = new HashSet<>(List.of(line.split("\\p{Punct}|\\p{Space}")));
        return originalWords.containsAll(generatedWords);
    }
}
