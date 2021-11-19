package com.pb.kozachenko.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин для регистрации: ");
        String login = scanner.nextLine();

        System.out.println("Введите пароль для регистрации: ");
        String password = scanner.nextLine();

        System.out.println("Введите повторно пароль: ");
        String confirmPassword = scanner.nextLine();
        Auth authNew = new Auth(login, password);

        try {
            authNew.signUp(login, password, confirmPassword);

            System.out.println("**************************");

            System.out.println("Введите логин для входа: ");
            String loginInNew = scanner.nextLine();

            System.out.println("Введите пароль для входа: ");
            String passwordInNew = scanner.nextLine();

            Auth auth = new Auth(loginInNew, passwordInNew);

            try {
                auth.signIn(loginInNew, passwordInNew);
            } catch (WrongLoginException e2) {
                System.out.println(e2.getMessage());
            }

        } catch (WrongLoginException | WrongPasswordException e1) {
            System.out.println(e1.getMessage());
        }
    }
}
