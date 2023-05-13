package org.example.exception;

import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {
            //Wrapper classes
        int i = 10;
        Integer j=i; // This is one way to autobox
        Integer k= new Integer(i); // This is old style of autoboxing

        int l=i; // old style of unboxing

        int m=j.intValue(); // new style of unboxing

        //Type conversion

        int a=12;
        long b=a;
        int c= (int) b;

        double d = 12.98;

        float f= 13.55f;

        double e = (double) f;

        String val = "30";

        int value = Integer.parseInt(val);

        int money = 34;
        String salary = String.valueOf(money);

     }

}

