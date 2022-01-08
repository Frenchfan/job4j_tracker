package ru.job4j.list;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        String last = list.remove(list.size() - 1);
        if (index < 0 || index >= list.size()) {
            return list;
        }
        list.set(index, last);
        return list;
    }
}