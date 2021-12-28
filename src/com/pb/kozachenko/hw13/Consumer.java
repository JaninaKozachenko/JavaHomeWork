package com.pb.kozachenko.hw13;

import java.util.List;

public class Consumer implements Runnable {
    private final List<Integer> num;

    public Consumer(List<Integer> num) {
        this.num = num;
    }

    public int consume() throws InterruptedException {
        synchronized (num) {
            if (num.size() < 5) {
                num.wait();
            }
            num.notifyAll();
            return num.remove(0);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Потреблено: " + consume());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
