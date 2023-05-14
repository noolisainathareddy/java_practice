import java.util.Optional;
import java.util.Scanner;

public class EightOptionalClass {
    static Optional<String> name(){
        String name=null;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter nuber : ");
        int num = sc.nextInt();
        if(num == 100){
            return Optional.of("sai");
        }
        else if(num == 200){
            return Optional.of("Hema");
        }
        else{
            return Optional.ofNullable(null);
        }
    }
    public static void main(String[] args) {
      Optional<String> result = name();
        if(result.isPresent()){
            System.out.println(result.get());
        }

    }
}
