package com.sai.sample.ashokit;

public class Car extends Engine{


    void car(String type){

    }
    public void drive(){
        int status  = super.start();
        if(status >0 ){
            System.out.println("Journey staretd");
        }
        else{
            System.out.println("Enigne havong some probelm ");
        }
    }
}
