import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Sai", 23, 101, "Vempalli"));
        arrayList.add(new Student("Hem", 30, 130, "Vempalli"));
        arrayList.add(new Student("Puneeth", 13, 120, "Vempalli"));
        arrayList.add(new Student("Singh", 50, 111, "Vempalli"));
        arrayList.add(new Student("Reddy", 33, 125, "Vempalli"));
        arrayList.add(new Student("Nagesh", 21, 100, "Vempalli"));

        Collections.sort(arrayList, new AgeCompare());
        Collections.sort(arrayList, new NameCompare());
        for(Student s:arrayList){
            System.out.println(s);
        }


    }
}
