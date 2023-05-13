public class Student implements Comparable<Student>{
    String name;
    int age;
    String place;
    int rollNum;

    public Student(String name, int age, String place, int rollNum) {
        this.name = name;
        this.age = age;
        this.place = place;
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", place='" + place + '\'' +
                ", rollNum=" + rollNum +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.age < o.age){
            return 1;
        }
        else if(this.age > o.age)
            return -1;
        else
            return 0;
    }
}
