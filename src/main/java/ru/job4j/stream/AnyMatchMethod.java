package ru.job4j.stream;

import java.util.List;

public class AnyMatchMethod {
    /**
     * Checking that any line starts with "job4j"
     * @param data initial stream
     * @return true / false
     */
    public static boolean check(List<String> data) {
        return data.stream()
                .anyMatch(x -> x.startsWith("job4j"));
    }
}
