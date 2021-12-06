package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2and3Then3() {
        int first = 1;
        int second = 2;
        int right = 3;
        int result = Max.max(first, second, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To3and1Then5() {
        int first = 5;
        int second = 3;
        int right = 1;
        int result = Max.max(first, second, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To7and4and5Then7() {
        int first = 2;
        int second = 7;
        int third = 4;
        int fourth = 5;
        int result = Max.max(first, second, third, fourth);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax15To2and7and17Then17() {
        int first = 15;
        int second = 2;
        int third = 7;
        int fourth = 17;
        int result = Max.max(first, second, third, fourth);
        int expected = 17;
        Assert.assertEquals(result, expected);
    }
}

