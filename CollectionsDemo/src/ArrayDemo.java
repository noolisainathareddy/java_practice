import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;



public class ArrayDemo {

	public static void main(String[] args)
	{
		ArrayList<Integer> list  = new ArrayList<>(Arrays.asList(1,1,2,3,2,5,5,7,8,9));
		
		LinkedHashSet<Integer> link = new LinkedHashSet<>(list);
		
		ArrayList<Integer> unique = new ArrayList<>(link);
		
		unique.stream().forEach(ele -> System.out.println(ele));
		
		List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
		
		
		
		
		
	}
}
