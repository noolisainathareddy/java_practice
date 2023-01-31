package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();

        list.add(new Employee("sai", 26, "HR", 2023, "male"));
        list.add(new Employee("hema", 32, "Engineer", 2017, "male"));
        list.add(new Employee("Sneha", 12, "MBA", 2032, "female"));
        list.add(new Employee("Sushi", 32, "HR", 1996, "female"));
        list.add(new Employee("Rekha", 41, "HR", 1863,"female"));
        list.add(new Employee("suri", 42, "MBA", 2021,"male"));
        list.add(new Employee("suma", 10, "MBA", 2021,"female"));
        list.add(new Employee("hari", 15, "HR", 2040,"male"));
        list.add(new Employee("merlin", 22, "Engineer", 2023,"female"));

        //Print number of employees based on dep
//        Map<String, Long> emp=list.stream().collect(Collectors.groupingBy(Employee::getDep, Collectors.counting()));
//        System.out.println(emp);

//
//        //Prnit name of the all the dep in organization
//        list.stream().map(Employee -> Employee.getDep()).forEach(e-> System.out.println(e));

        //Prnit name of the unique the dep in organization
//       list.stream().map(e-> e.getDep()).distinct().forEach(e-> System.out.println(e));

    }
}