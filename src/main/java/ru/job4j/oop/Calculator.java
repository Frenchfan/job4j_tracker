package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int digit) {
        return digit - x;
    }

    public int divide(int digit) {
        return digit / x;
    }

    public int sumAllOperation(int digit) {
        return sum(digit) + multiply(digit) + minus(digit) + divide(digit);
    }

    public int multiply(int a) {
        return x * a;
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int a = 17;
        System.out.println(minus(a));
        int b = calculator.divide(15);
        System.out.println(b);
        int c = calculator.sumAllOperation(25);
        System.out.println(c);
    }
}
