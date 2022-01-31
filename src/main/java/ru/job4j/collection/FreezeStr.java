package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        List<String> myLeft = new ArrayList<>(List.of(left.split("")));
        List<String> myRight = new ArrayList<>(List.of(right.split("")));
        Collections.sort(myLeft);
        Collections.sort(myRight);
        return myRight.equals(myLeft);
    }
}