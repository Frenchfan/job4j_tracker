package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " rolls on the rails");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " does the \"cho-cho\" sound");
    }
}
