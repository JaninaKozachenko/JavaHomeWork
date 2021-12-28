package com.pb.kozachenko.hw13;

import java.util.List;

public class Producer implements Runnable {
    private final List<Integer> num;
    private final int SIZE;

    public Producer(List<Integer> num, int size) {
        this.num = num;
        SIZE = size;
    }

    public int produce() throws InterruptedException {
        synchronized (num) {
            if (num.size() == SIZE) {
                num.wait();
            }
            int newNum = (int) (Math.random() * 100);
            num.add(newNum);
            num.notifyAll();

            return newNum;
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Произведено: " + produce());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}


