package com.example.practice.java8;

import io.micrometer.observation.Observation;

@FunctionalInterface
interface TestTwo{
    public void m1();
}
class Lambda {
    public static void main(String[] args) {
      TestTwo tt = () -> {System.out.println("Thi is lambda expression");};
      tt.m1();
    }
}
