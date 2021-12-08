package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        Item[] notnullItems = new Item[size];
        int notnullSize = 0;
        for (int i = 0; i < size; i++) {
            if (items[i] != null) {
                notnullItems[notnullSize] = items[i];
                notnullSize++;
            }
        }
        return Arrays.copyOf(notnullItems, notnullSize);
    }

    public Item[] findByName(String key) {
        Item[] foundItems = new Item[size];
        int foundSize = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                foundItems[foundSize] = items[i];
                foundSize++;
            }
        }
        return Arrays.copyOf(foundItems, foundSize);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(items[index].getId());
            items[index] = item;
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        int length = size - index - 1;
        int start = index + 1;
        if (index != -1) {
            System.arraycopy(items, start, items, index, length);
            items[size] = null;
            size--;
            return true;
        } else {
            return false;
        }
    }
}