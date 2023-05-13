package com.example.practice.java8;

public class Test implements IPayment{
    @Override
    public void call() {
        System.out.println("This is from static method");
    }
}
