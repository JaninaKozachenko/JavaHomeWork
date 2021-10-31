package com.pb.kozachenko.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static String isAnagram(String firstSentence, String secondSentence) {
        String answer = "";
        char[] firstArray = firstSentence.replaceAll("[\\p{Punct} ]", "").toCharArray();
        char[] secondArray = secondSentence.replaceAll("[\\p{Punct} ]", "").toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        if (Arrays.equals(firstArray, secondArray)) {
            answer = "Анаграмма";
        } else {
            answer = "Не анаграмма";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String firstSentence = scanner.nextLine().toLowerCase();
        System.out.println("Введите вторую строку:");
        String secondSentence = scanner.nextLine().toLowerCase();
        String result = isAnagram(firstSentence, secondSentence);
        System.out.println(result);
    }
}
