package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("ialexandrov@rambler.ru", "Ivan Alexandrov");
        map.put("psumkin@gmail.com", "Petr Sumkin");
        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println("У клиента " + entry.getValue() + " электронная почта " + entry.getKey());
        }
    }
}
