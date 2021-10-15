package com.pb.kozachenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int numb = scanner.nextInt();
        if (numb >= 0 && numb <= 14) {
            System.out.println("Введенное число попадает в диапазон [0-14]");
        } else if (numb >= 15 && numb <= 35) {
            System.out.println("Введенное число попадает в диапазон [15-35]");
        } else if (numb >= 36 && numb <= 50) {
            System.out.println("Введенное число попадает в диапазон [36-50]");
        } else if (numb >= 51 && numb <= 100) {
            System.out.println("Введенное число попадает в диапазон [51-100]");
        } else System.out.println("Введенное число не попадает ни в один из диапазонов(");
    }
}
