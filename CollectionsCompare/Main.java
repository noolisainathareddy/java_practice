
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Sai", 25, "Vempalli", 101));
        arrayList.add(new Student("Hema", 20, "Vempalli", 150));
        arrayList.add(new Student("Ravi", 30, "Vempalli", 131));
        arrayList.add(new Student("Tej", 21, "Vempalli", 120));
        arrayList.add(new Student("Sunak", 10, "Vempalli", 130));
        Collections.sort(arrayList);


    for(int i =0; i<arrayList.size();i++){
        System.out.println(arrayList.get(i));
    }
        // For each loop
//        for(Student s:arrayList){
//            System.out.println(s);
//        }
        //Iterator
//        Iterator<Student> iterator = arrayList.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //ListIterator
//        ListIterator<Student> listIterator = arrayList.listIterator();
//        while(listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }
//
//        while(listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }

        //For each method
//        arrayList.forEach(i -> System.out.println(i));



    }
}
