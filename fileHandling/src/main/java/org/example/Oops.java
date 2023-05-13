package org.example;

public class Oops {

    public static void main(String args[]){
        String s = "welcometojava";
        int k = 3;
        String sequence=s.substring(0,k);
        String smallest = sequence;
        String largest = sequence;

        System.out.println(s.length());

        for(int i=0; i<=s.length()-k; i++ ){
            sequence = s.substring(i,k+i);
            if(sequence.compareToIgnoreCase(smallest) < 0){
                smallest = sequence;
            }
            if(sequence.compareToIgnoreCase(largest) > 0 ){
                largest = sequence;
            }
        }

        System.out.println("smallest : " + smallest + "     largest : " + largest);

    }
}
