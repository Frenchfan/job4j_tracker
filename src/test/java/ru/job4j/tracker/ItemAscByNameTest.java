package ru.job4j.tracker;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ItemAscByNameTest extends TestCase {

    public void testCompare() {
        List<Item> items = new ArrayList<>();
        Item first = new Item("First");
        Item second = new Item("Second");
        Item third = new Item("Third");
        items.add(second);
        items.add(third);
        items.add(first);
        List<Item> expected = new ArrayList<>();
        expected.add(first);
        expected.add(second);
        expected.add(third);
        Collections.sort(items, new ItemAscByName());
        assertThat(items, is(expected));
    }
}