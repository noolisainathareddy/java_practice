import java.util.HashMap;
import java.util.Iterator;

public class Demo {
	
	public static void main(String[] args)
	{
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(101, "Sai Natha Reddy"); 
		map.put(102, "Purna Kondepati"); 
		map.put(103, "Akhil Chella"); 
		map.put(104, "Poojith"); 
		
		
		//System.out.println(map);
		
		Iterator<Integer> it= map.keySet().iterator(); 
		
		while(it.hasNext())
		{
			System.out.println(it.next()); 
		}
		
	}
}
