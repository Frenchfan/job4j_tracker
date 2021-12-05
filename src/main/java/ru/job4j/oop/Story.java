package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf1 wolf = new Wolf1();
        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}