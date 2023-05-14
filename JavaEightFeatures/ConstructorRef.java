import java.util.function.Supplier;

public class ConstructorRef {

    public static void main(String[] args) {
        //Test test= new Test();

        Supplier<Test> supplier = Test::new;
        Test test = supplier.get();
        System.out.println(test.hashCode());
    }
}
