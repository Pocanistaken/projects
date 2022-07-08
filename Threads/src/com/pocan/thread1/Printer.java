package com.pocan.thread1;

public class Printer extends Thread{
    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println(isim + "Working");

        for(int i = 0; i < 10; i++) {
            try {
                System.out.println(isim + "Writing : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread canceled");
                throw new RuntimeException(e);
            }
        }

        System.out.println("Done.");

    }
}
