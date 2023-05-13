package org.example;

import java.io.*;
import java.util.Arrays;

class GFG<T> {

    public void m1(T i){
        System.out.println("Value passed in m1" + i);
    }
    public static void main(String args[]){
        GFG d=new GFG();
        d.m1(10);
        d.m1("sai");
        d.m1(true);
    }
}