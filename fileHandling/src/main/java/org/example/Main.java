package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Student student = new Student();
//        student.name = "sai";
//        student.age = 26;
//        student.place = "vempalli";
//
//        System.out.println(student.toString());

        File file = new File("/Users/sainooli/Desktop/Java_Prep_Notes/Core-Java/object.txt");

//        FileOutputStream fos = new FileOutputStream(file);
//
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//        oos.writeObject(student);
//
//        oos.close();

//        FileInputStream fis= new FileInputStream(file);
//        ObjectInputStream ois= new ObjectInputStream(fis);
//
//        Object obj =  ois.readObject();
//
//        Student student = (Student) obj;
//
//        System.out.println(obj);

        int i = 10;
        int j = i++;


        System.out.println(j);
        System.out.println(i);

    }

    public void test(){
        System.out.println("sai form test");
    }

    {
        System.out.println("sai");
    }
}