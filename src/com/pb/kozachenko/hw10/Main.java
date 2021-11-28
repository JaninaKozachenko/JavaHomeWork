package com.pb.kozachenko.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Integer> numI = new NumBox<>(3);
        try {
            numI.add(0, 1);
            numI.add(1, 6);
            numI.add(2, 4);
            //num.add(3, 9);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Превышено кол-во значений");
        }

        NumBox<Float> numF = new NumBox<>(4);
        try {numF.add(0, 1.4f);
            numF.add(1, 6.3f);
            numF.add(2, 4.7f);
            numF.add(3, 9.9f);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Превышено кол-во значений");
        }



        numI.get(0);
        System.out.println(numI.get(0));
        System.out.println("Текущее кол-во элементов массива: " + numI.length());
        System.out.println("Среднее элементов массива: " + numI.average());
        System.out.println("Сумма элементов массива: " + numI.sum());
        System.out.println("Максимальный элемент массива: " + numI.max());

        numF.get(0);
        System.out.println(numF.get(0));
        System.out.println("Текущее кол-во элементов массива: " + numF.length());
        System.out.println("Среднее элементов массива: " + numF.average());
        System.out.println("Сумма элементов массива: " + numF.sum());
        System.out.println("Максимальный элемент массива: " + numF.max());
    }
}
