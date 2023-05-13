package org.example;

import java.util.ArrayList;

public class E {

    public static void main(String[] args){
        String name = "welcometojava";
        int k = 3; 

        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<name.length()-(k-1);i++){
            //System.out.println(name.substring(i,i+3));
            arr.add(name.substring(i,i+3));
        }
        //arr.forEach(i -> System.out.print(i));
        for(int i=0; i<arr.size();i++){
            for(int j=i+1; j< arr.size();j++){
                if(arr.get(i).compareToIgnoreCase(arr.get(j)) > 0 ){
                    String temp= arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, temp);
                }
            }
        }
        arr.forEach(i -> System.out.print(i + ", "));

    }
}
