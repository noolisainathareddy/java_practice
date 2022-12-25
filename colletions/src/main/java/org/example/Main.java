package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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



        for(int i=0;i<arr.size()-1;i++){
            //System.out.println(arr.get(i));
        }
    }

}