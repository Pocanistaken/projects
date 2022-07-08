package com.pocan.thread3;

public class Main {
    public static void main(String[] args) {

        Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is working.");
                for(int i = 0; i < 10 ; i++) {
                    try {
                        System.out.println("Thread is writing = " + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        });

        printer1.start();

    }
}
