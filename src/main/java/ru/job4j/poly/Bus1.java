package ru.job4j.poly;

public class Bus1 implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moves along the road");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " does the beep");
    }
}
