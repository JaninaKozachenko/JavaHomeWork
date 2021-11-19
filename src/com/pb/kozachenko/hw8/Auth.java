package com.pb.kozachenko.hw8;

import com.pb.kozachenko.hw5.Book;

public class Auth {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Auth(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        int countLogin = 0;
        for (int i = 0; i < login.length(); i++) {
            countLogin++;
        }
        if (countLogin < 5 || countLogin > 20 || !login.matches("[a-zA-Z0-9]+"))
            throw new WrongLoginException("Некорректный логин! Логин должен содержать от 5 до 20 символов и только латинские буквы и цифры.");

        int countPassword = 0;
        for (int i = 0; i < password.length(); i++) {
            countPassword++;
        }
        if (countPassword < 5 || !password.matches("[_a-zA-Z0-9]+") || !confirmPassword.equals(password))
            throw new WrongPasswordException("Некорректный пароль! Длина пароля должна быть более 5 символов, только латинские буквы и цифры и знак подчеркивания");
        else {
            System.out.println(login + ", поздравляем, Вы зарегестрированы!");
        }
    }


    public void signIn(String loginInNew, String passwordInNew) throws WrongLoginException {

        if (!loginInNew.matches("yanina") || !passwordInNew.matches("12345"))
            throw new WrongLoginException("Некорректный логин или пароль!");
        else {
            System.out.println("вы вошли");
        }
    }
}