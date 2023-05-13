package org.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main{

    public synchronized void withdraw() throws InterruptedException {
        System.out.println("Amount widraw requested.....");
        System.out.println("Insufficient funds");
        wait();
        System.out.println("Amount withdrawn");
    }

    public synchronized void deposit(){
        System.out.println("Amount deposited");
        notify();
    }

    public static void main(String[] args) {

      Main main=new Main();
        Thread thread1 = new Thread(){
            public void run(){
                try {
                    main.withdraw();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread2 = new Thread(){
            public void run(){
                main.deposit();
            }
        };

        thread1.start();
        thread2.start();


    }
}