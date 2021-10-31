//Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
//Строку должен ввести пользователь.
//Пример работы:
//Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
//Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
//При выполнении задания использовать метод(ы).
package com.pb.kozachenko.hw4;

import java.util.Scanner;

public class CapitalLetter {
    static String UpCase (String sentence){
        String text ="";
        text = text + sentence.substring(0,1).toUpperCase();
        for (int i = 1; i < sentence.length(); i++) {
            if (" ".equals(sentence.substring(i-1,i))) {
                text= text + sentence.substring(i,i+1).toUpperCase();
            } else text= text + sentence.substring(i,i+1);
        }
        return text;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для обработки:");
        String sentence = scanner.nextLine();
        String text = UpCase(sentence);
        System.out.println(text);
    }
}
