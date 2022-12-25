package com.sai.sample.demointerface;

public class Dell implements Laptop {
    public void copy(){
        System.out.println("this statement is there to copy - Dell");
    }

    public void paste(){
        System.out.println("This statement is there to copy - Dell");
    }
    public void delete(){
        System.out.println("This statement is there to delete - Dell");
    }

    public void camera(){
        System.out.println("This statement is there for camera - Dell");
    }
}
