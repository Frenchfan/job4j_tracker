package ru.job4j.poly;

public class PolyTransport {
    public static void main(String[] args) {
        Vehicle plane1 = new Aircraft();
        Vehicle plane2 = new Aircraft();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle bus1 = new Bus1();
        Vehicle bus2 = new Bus1();
        Vehicle[] vehicles = new Vehicle[]{bus1, plane1, train1, plane2, train2, bus2};
        for (Vehicle v : vehicles) {
            v.move();
            v.sound();
        }
    }
}
