package com.sai.sample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bus implements Runnable{

    @Override
    public void run(){

        for(int i=1;i<30; i++){
            System.out.println("Current thread : " + Thread.currentThread().getName());

        }

    }
}
