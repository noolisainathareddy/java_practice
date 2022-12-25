import java.util.HashMap;

public class NoOfTimesRepeated {
	
	public static void main(String[] args)
	{
		
		String[] pool = {"water", "air", "water", "mug", "water", "mug", "air"}; 
		HashMap<String, Integer> map = new HashMap<>(); 
		
		
		for(String i:pool)
		{
			
			if(map.containsKey(i))
			{
				map.put(i, map.get(i) + 1);
			}
			
			else
			{
				map.put(i,1);
			}
			//System.out.println(i);
			
			
		}
		
		System.out.println(map);
		
		
	}

}
