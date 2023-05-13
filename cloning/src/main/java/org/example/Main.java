package org.example;

public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee("sai", 26, "vemapalli");
        Employee e2= e1;

        e1.setPlace("hyd");
        System.out.println("e2" + e2.hashCode() + " : " + e2 );
        System.out.println("e1" + e1.hashCode() + " : " + e1);


    }
}