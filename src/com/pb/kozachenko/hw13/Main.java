package com.pb.kozachenko.hw13;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        int size = 5;
        Consumer consumer = new Consumer(num);
        Producer producer = new Producer(num, size);
        Thread consumerWorker = new Thread(consumer);
        Thread producerWorker = new Thread(producer);

        consumerWorker.start();
        producerWorker.start();


    }


}
