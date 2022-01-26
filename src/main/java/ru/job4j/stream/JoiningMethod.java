package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningMethod {
    /**
     * Join the strings with the System.lineSeparator(), add "Prefix" and "Suffix"
     * @param strings original strings
     * @return joined expression
     */
    public static String join(List<String> strings) {
        return strings.stream()
                .collect(Collectors.joining(System.lineSeparator(), "Prefix", "Suffix"));
    }
}
