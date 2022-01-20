package ru.job4j.lambda;

import java.util.Optional;

public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        Optional<Integer> test = indexOf(data, el);
        return test.orElse(-1);
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        boolean found = false;
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                found = true;
                index = i;
                break;
            }
        }
        return (found) ? Optional.of(index) : Optional.empty();
    }
}
