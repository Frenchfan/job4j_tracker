package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("I go along the road");
    }

    @Override
    public void passengers(int countPassengers) {
        System.out.println(countPassengers + " are aboard");
    }

    @Override
    public int refill(int litres) {
        return 100 - litres;
    }
}
