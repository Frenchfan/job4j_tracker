package ru.job4j.ex;

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenminus1thenException() {
        int digit = Fact.calc(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenminus5thenException() {
        int digit = Fact.calc(-5);
    }
}