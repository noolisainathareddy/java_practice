import java.util.HashMap; 

public class DuplicateCheck {

	public static void main(String[] args) {
			 
		HashMap<String, Integer> map= new HashMap<>(); 
		
		String arr[] = {"water", "air", "fire", "fire", "water", "water", "air", "cool"};
		
		for(String i:arr)
		{
			
			if(map.containsKey(i))
			{
				System.out.println("second time " + i); 
				map.put(i, map.get(i)+1);
			}
			
			else 
			{
				map.put(i, 1);
				System.out.println("First time " + i);
			}
				  
		}
		
		System.out.println(map); 
	}

}



