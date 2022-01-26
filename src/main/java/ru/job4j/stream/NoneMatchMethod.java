package ru.job4j.stream;

import java.util.List;

public class NoneMatchMethod {
    /**
     * Check that the list does not contain empty lines
     * @param list initial list
     * @return true / false
     */
    public static boolean check(List<String> list) {
        return list.stream()
                .noneMatch(String::isEmpty);
    }
}
