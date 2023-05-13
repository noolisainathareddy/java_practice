package org.example;

import java.sql.SQLOutput;

public class Sample extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread is exectuing....");
    }

    public static void main(String[] args) {

        Sample sample=new Sample();
        Thread t=new Thread(sample);
        t.setName("first thread");
        t.start();

    }
}
