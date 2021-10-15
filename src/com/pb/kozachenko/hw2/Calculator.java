package com.pb.kozachenko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int operand1 = scanner.nextInt();
        System.out.println("Введите нужное арифметическое дествие (+, -, *, /):");
        String sign = scanner.next();
        System.out.println("Введите второе целое число:");
        float operand2 = scanner.nextInt();
        switch (sign) {
            case "+":
                System.out.println("Результат операции: " + operand1 + sign + operand2 + "=" + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Результат операции: " + operand1 + sign + operand2 + "=" + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Результат операции: " + operand1 + sign + operand2 + "=" + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Деление на 0 невозможно");
                    break;
                }
                float result = operand1 / operand2;
                System.out.println("Результат операции: " + operand1 + sign + operand2 + "=" + result);
                break;
            default:
                System.out.println("Проверьте корректоность ввода данных");
        }
    }
}
