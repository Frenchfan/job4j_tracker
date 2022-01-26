package ru.job4j.stream;

import java.util.List;

public class AllMatchMethod {
    /**
     * Checking if the length of the lines is over 3
     * @param list initial list
     * @return returns true / false
     */
    public static boolean check(List<String> list) {
        return list.stream()
                .allMatch(x -> x.length() > 3);
    }
}
