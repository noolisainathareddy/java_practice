package org.example;

import java.io.Serializable;

public class Student implements Comparable<Student> {
    String name;
    Integer age;

    Integer rollNum;

    @Override
    public int compareTo(Student s) {
        return this.rollNum - s.rollNum;
    }

    public Student(String name, Integer age, Integer rollNum) {
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNum='" + rollNum + '\'' +
                '}';
    }
}
