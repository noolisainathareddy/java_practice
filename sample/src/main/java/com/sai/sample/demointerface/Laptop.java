package com.sai.sample.demointerface;

public interface Laptop {

    public void copy();
    public void paste();
    public void delete();
    public void camera();


    default void keyboard(){
        System.out.println("Keyboard is mandatory for all laptops");
    }

    static void cursor(){
        System.out.println("Mouse is mandatory for all laptops");
    }
}
