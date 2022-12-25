package merlin;
import java.util.Map; 
import java.util.HashMap; 


public class helloWorld {
	public static void main(String[] args)
	{
		String roman="XLC"; 
		Map<Character, Integer> map=new HashMap<>();
		map.put('C', 100);
		map.put('X', 10);
		map.put('L', 50); 
		
		int sum=0; 
		
		int n = roman.length(); 
		
		for(int i=0; i<n; i++)
		{
			if(i !=n-1 && map.get(roman.charAt(i)) < map.get(roman.charAt(i+1)))
			{
				sum = sum + map.get(roman.charAt(i+1)) - map.get(roman.charAt(i)); 
				i++; 
			}
			else
			{
				sum = sum + map.get(roman.charAt(i)); 
			}
		}
		
		System.out.println("sum :" + sum); 
	
	}

}
