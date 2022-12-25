package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Listarray {

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(100);
        arr.add(500);
        arr.add(400);
        arr.add(300);
        arr.add(150);
        arr.add(60);
        arr.add(35);
        arr.add(109);
        arr.add(800);


        //Advanced for loop
        for(Integer i:arr){
            //System.out.println(i);
        }

        //for loop
        for(int i=0;i<arr.size()-1;i++){
            //System.out.println(arr.get(i));
        }

        //while loop
        int n=0;
        while(arr.size() > n){
            //System.out.println(arr.get(n) +"  :" + n);
            n++;
        }


        //Iterator
        /*
        System.out.println("iterator");
        Iterator it = arr.iterator();
        while(it.hasNext()){
            //System.out.println(it.next());
        }
         */
        System.out.println("List iterator");
        //List Iterator - forward direction
        ListIterator lisItr = arr.listIterator();

        while(lisItr.hasNext()){
            System.out.println(lisItr.next());
        }

        //List Iterator Backward direction
        while(lisItr.hasPrevious()){
            System.out.println(lisItr.previous());
        }
    }
}
