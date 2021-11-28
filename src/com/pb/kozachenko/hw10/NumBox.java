package com.pb.kozachenko.hw10;

public class NumBox<T extends Number> {

    private final T[] numbers;

    @SuppressWarnings("unchecked")
    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    //public NumBox(T[] numbers) {
      //  this.numbers = numbers;
   // }

    public void add(int index, T number) {
        this.numbers[index] = number;
    }

    public T get (int index) {
        return numbers [index];
    }

    public int length() {
        return numbers.length;
    }

    public double average() {
        int count = 0;
        double sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            sum += numbers [i].doubleValue();
            count++;
        }
        double avg = sum / count;
        return avg;
    }

    public double sum() {
        double sum = 0;
        for (T n : numbers) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public T max() {
        T max = numbers [0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].doubleValue() >= max.doubleValue()) {
                max = numbers[i];
            }
        }
        return max;
    }
}