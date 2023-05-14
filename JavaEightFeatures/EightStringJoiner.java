import java.util.StringJoiner;

public class EightStringJoiner {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner("-");
        sj.add("sai");
        sj.add("Natha");
        sj.add("Reddy");
        sj.add("Nooli");
        System.out.println(sj);

        StringJoiner sj2= new StringJoiner("-","(", ")");
        sj2.add("sai");
        sj2.add("Natha");
        sj2.add("Reddy");
        sj2.add("Nooli");
        System.out.println(sj2);



    }
}
