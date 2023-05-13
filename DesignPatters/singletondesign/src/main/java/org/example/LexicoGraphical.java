package org.example;

import java.util.Arrays;

public class LexicoGraphical {

    public static void main(String args[]){
        String arr[] = {"Sai", "Hema", "Alpha"};

        for(int i = 0; i< arr.length;i++){
            for(int j=i+1; j< arr.length;j++){
                if(arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
