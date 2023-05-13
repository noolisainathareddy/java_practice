package com.example.practice.java8;

public interface IPayment {

    public void call();

    private void dail(){
        System.out.println("this is private....");
    }

    public static void pay(){
        System.out.println("Thi is a static method");
    }

    default void m1(){
        System.out.println("This is default method");
        dail();
    }
}
