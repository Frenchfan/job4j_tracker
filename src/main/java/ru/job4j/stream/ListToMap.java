package ru.job4j.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    /**
     * Метод преобразует лист в мапу, где фамилия - ключ, а student - значение
     * @param list
     * @return
     */
    public static Map<String, Student> convert(List<Student> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toMap(
                        Student::getSurname, x -> x,
                        (x, x2) -> x));
    }
}