package org.example;

public class Main {
    public static void main(String[] args) {
       String str1 ="b";

       String str2 = "A";

       if(str1.compareToIgnoreCase(str2) > 0){
           System.out.println("str1 is bigger than str2");
       }
    }
}