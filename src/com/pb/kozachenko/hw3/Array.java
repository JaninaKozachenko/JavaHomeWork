package com.pb.kozachenko.hw3;

import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите целое число (элемент массива " + (i + 1) + "):");
            array[i] = scanner.nextInt();
        }
        //System.out.println("Элементы созданного массива:"+ Arrays.toString(array));
        System.out.println("Введенные элементы массива: ");
        for (int i = 0; i < array.length; i++) { // вывод на экран элеменов массива
            System.out.println(array[i]);
        }
        int sum = 0; // сумма чисел массива
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма чисел массива: " + sum);
        int count = 0; // кол-во положительных чисел в массиве
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        System.out.println("Количество положительных чисел массива: " + count);
        System.out.println("Сортировка от меньшего к большему:");
        int sortMas;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    sortMas = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = sortMas;
                }
            }
        }
        for (int i = 0; i < array.length; i++) { // вывод на экран элеменов отсортированного массива
            System.out.println(array[i]);
        }
        //System.out.println(Arrays.toString(array));
    }
}
