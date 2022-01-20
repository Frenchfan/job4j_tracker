package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        boolean rsl = false;
        for (String s: strings) {
            if (value.equals(s)) {
                rsl = true;
                break;
            }
        }
        return rsl ? Optional.of(value) : Optional.empty();
    }
}
