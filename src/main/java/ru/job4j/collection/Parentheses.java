package ru.job4j.collection;

public class Parentheses {
    public static boolean valid(char[] data) {
        int parentheses = 0;
        for (char myChar: data) {
            if (myChar == '(') {
                parentheses++;
            } else if (myChar == ')') {
                parentheses--;
            }
            if (parentheses < 0) {
                return false;
            }
        }
        return parentheses == 0;
    }
}
