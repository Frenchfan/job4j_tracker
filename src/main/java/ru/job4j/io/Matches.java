package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            boolean wrongInput = true;
            int matches = 0;
            while (wrongInput) {
                matches = Integer.parseInt(input.nextLine());
                if ((matches == 1 || matches == 2 || matches == 3) && (count - matches >= 0)) {
                    wrongInput = false;
                } else if (count - matches < 0) {
                    System.out.println("Осталось только " + count + " спичек. Введите другое число");
                } else {
                    System.out.println("Можно ввести только числа от 1 до 3");
                }
            }
            turn = !turn;
            /* Остальная логика игры. */
            count -= matches;
            System.out.println("На столе осталось " + count + " спичек");
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
