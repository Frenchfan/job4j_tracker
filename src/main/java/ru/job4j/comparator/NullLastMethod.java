package ru.job4j.comparator;

import java.util.Comparator;

public class NullLastMethod {
    public static Comparator<String> nullLast() {
        Comparator<String> comparator = Comparator.nullsLast(Comparator.naturalOrder());
        return comparator;
    }
}
