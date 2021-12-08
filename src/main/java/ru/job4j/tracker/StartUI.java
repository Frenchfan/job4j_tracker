package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item oneItem = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String formattedDateTime = oneItem.getCreated().format(formatter);
        System.out.println(formattedDateTime);
        System.out.println(oneItem);
    }
}
