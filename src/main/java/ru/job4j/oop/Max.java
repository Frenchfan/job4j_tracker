package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        boolean leftmore = left > right;
        int result = leftmore ? left : right;
        return result;
    }

    public static int max(int first, int second, int right) {
        return max(max(first, second), right);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second), max(third, fourth));
    }
}
