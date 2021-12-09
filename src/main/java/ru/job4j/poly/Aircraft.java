package ru.job4j.poly;

public class Aircraft implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " flies in the air");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + "'s turbines make loud noises");
    }
}
