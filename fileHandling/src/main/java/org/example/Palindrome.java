package org.example;

import java.util.*;

public class Palindrome {
    public static void main(String args[]){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("sai", 26, 106));
        list.add(new Student("Hema", 27,101 ));
        list.add(new Student("Siva", 29,105 ));
        list.add(new Student("Raja", 15,103 ));
        list.add(new Student("Venu", 10,104 ));
        list.add(new Student("Ramu", 60,102 ));

        for(Student s:list){
            System.out.println(s);
        }
        Collections.sort(list);
        System.out.println("==========================");
        for(Student s:list){
            System.out.println(s);
        }
    }
}
