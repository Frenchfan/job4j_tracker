package ru.job4j.stream;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToAnyCollection {
    /**
     * collecting the stream to a LinkedHashSet via .collect(Collectors.toCollection(.....::new)
     * just change the collection type to get the desired collection
     * @param data
     * @return
     */
    public static Set<Integer> collect(Stream<Integer> data) {
       return data.collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
