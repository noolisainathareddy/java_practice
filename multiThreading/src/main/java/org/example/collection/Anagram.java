package org.example.collection;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String a = "Hello";
        String b = "ollHe";
        StringBuilder c= new StringBuilder(b);
        boolean ret = false;

        if(a.length()==b.length()){
            for(int i=0; i<a.length();i++){
                for(int j=0; j<c.length();j++){
                    if(a.charAt(i)==c.charAt(j)){
                        c.deleteCharAt(j);
                        if(i==a.length()-1 && c.length()==0){
                            ret=true;
                            break;
                        }
                        break;

                    }

                }
            }
        }

    }
}
