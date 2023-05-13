package org.example;

import java.util.Arrays;

public class Sorting {
    public static void main(String args[]){
        int numbers[] = {60,30,10,20,40,50,90,80,0};

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    int temp= numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
