import java.util.Date;
import java.text.SimpleDateFormat;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf= new SimpleDateFormat("MM/DD/YYYY");
        SimpleDateFormat sdf2= new SimpleDateFormat("M D Y");
        String formatDate = sdf.format(d);
        String formatDate2= sdf2.format(d);
        System.out.println(formatDate2);
    }
}
