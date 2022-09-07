import java.util.ArrayList; 
import java.util.LinkedHashSet; 

public class DuplicateCheck {

	public static void main(String[] args) {
			
		ArrayList<Integer> arr= new ArrayList<>(); 
		
		arr.add(2); 
		arr.add(10);
		arr.add(10);
		arr.add(10);
		arr.add(10);
		arr.add(10);
		arr.add(2); 
		
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>(arr); 
		
		ArrayList<Integer> arr2= new ArrayList<>(set); 
		System.out.println(arr2); 
	}
}


