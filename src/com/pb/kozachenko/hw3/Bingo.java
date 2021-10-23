package com.pb.kozachenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        // int programNumber = (int) Math.floor(Math.random() * 100); //загадывание рандомного числа
        Random random = new Random();
        int programNumber = random.nextInt(101);
        int userNumber;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте целое число от 0 до 100. Для прекращения игры введите: 1000");
        do {
            System.out.println("Введите Ваш вариант:");
            userNumber = scanner.nextInt();
            if (userNumber > programNumber && userNumber <= 100 && userNumber >= 0) {
                System.out.println("Вы не угадали! Введенное число больше загадонного. Попробуйте еще раз.");
            } else if (userNumber < programNumber && userNumber <= 100 && userNumber >= 0) {
                System.out.println("Вы не угадали! Введенное число меньше загадонного. Попробуйте еще раз.");
            } else if (userNumber == programNumber && userNumber <= 100 && userNumber >= 0) {
                System.out.println("Вы угадали! Это число " + programNumber + ".");
            } else if (userNumber == 1000) {
                break;
            } else System.out.println("Введите корретно целое число от 0 до 100");
            count++;
        }
        while (userNumber != programNumber);
        System.out.println("Конец игры! Количество осуществленных попыток: " + count);
    }
}
