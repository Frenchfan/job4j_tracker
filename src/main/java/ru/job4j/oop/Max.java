package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        boolean leftmore = left > right;
        int result = leftmore ? left : right;
        return result;
    }

    public static int max(int first, int second, int right) {
        int left = max(first, second);
        boolean leftmore = left > right;
        int result = leftmore ? left : right;
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int left = max(first, second);
        int right = max(third, fourth);
        boolean leftmore = left > right;
        int result = leftmore ? left : right;
        return result;
    }
}
