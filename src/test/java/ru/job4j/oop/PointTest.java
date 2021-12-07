package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when43to77then5() {
        double expected = 5;
        Point a = new Point(4, 3);
        Point b = new Point(7, 7);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when23to4326then47dot01() {
        double expected = 47.01;
        Point a = new Point(2, 3);
        Point b = new Point(43, 26);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when00to10then1() {
        double expected = 1;
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when01to10then1dot41() {
        double expected = 1.41;
        Point a = new Point(0, 1);
        Point b = new Point(1, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when000to100then1() {
        double expected = 1;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 0, 0);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when000to111then1dot73() {
        double expected = 1.73;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when000to220then2dot83() {
        double expected = 2.83;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 0);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}
