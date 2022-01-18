package ru.job4j.collection;

import java.util.Comparator;

/**
 * Компаратор сравнивает первые элементы кодов подразделений в порядке убывания,
 * при равенстве - сравнивает в прямом порядке остальные - см. тест
 */
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] line1 = o1.split("/");
        String[] line2 = o2.split("/");
        int rsl = line2[0].compareTo(line1[0]);
        if (rsl != 0) {
            return rsl;
        }
        return o1.compareTo(o2);
    }
}