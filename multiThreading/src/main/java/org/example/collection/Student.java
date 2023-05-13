package org.example.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Student {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(20);
        list.add(60);
        list.add(40);
        list.add(80);
        list.add(90);

//        Iterator it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

//        for(Integer it:list){
//            System.out.println(it);
//        }
//        ListIterator<Integer> it = list.listIterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        System.out.println("==============");
//        while(it.hasPrevious()){
//            System.out.println(it.previous());
//        }
            list.forEach(i -> System.out.println(i));

    }
}
