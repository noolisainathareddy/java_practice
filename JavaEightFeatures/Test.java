


// Method reference
interface Math{
    public int math(int a, int b);
}

public class Test {

    Test(){
        System.out.println("Test : Constructor");
    }
     static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Math func=Test::sum;
        int sum = func.math(5,6);
        System.out.println(sum);
    }
}
