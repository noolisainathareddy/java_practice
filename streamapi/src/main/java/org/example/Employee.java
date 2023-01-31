package org.example;

public class Employee {
    private String name;
    private Integer age;
    private String dep;
    private Integer year;

    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender){
        this.gender=gender;
    }

    public String getGender(){
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dep='" + dep + '\'' +
                ", year=" + year +
                '}';
    }

    public Employee(String name, Integer age, String dep, Integer year, String gender) {
        this.name = name;
        this.age = age;
        this.dep = dep;
        this.year = year;
        this.gender = gender;
    }
}
