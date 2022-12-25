package com.sai.sample.demointerface;

public class Demo {

    public static void main(String[] args){
        Dell dell =new Dell();
        dell.camera();
        dell.copy();
        dell.delete();
        dell.paste();

        dell.keyboard();
        Laptop.cursor();
    }
}
