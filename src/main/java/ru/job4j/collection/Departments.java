package ru.job4j.collection;

import java.util.*;

public class Departments {
    /**
     * Метод дополняет матрицу кодов подразделений,
     * формируя множество всех возможных сочетаний
     * @param deps список кодов подразделений (неполный)
     * @return возвращает дополненный список кодов подразделений
     */
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start = start.equals("") ? el : start + "/" + el;
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}