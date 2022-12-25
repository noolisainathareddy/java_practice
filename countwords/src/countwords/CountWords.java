package countwords;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountWords {
	
	public static void main(String[] args) {
		String[] arr = {"sai", "hema", "siva", "akhil", "sai", "sai", "akhil", "hema"}; 
		
		Map<String, Integer> map=new HashMap<>(); 
		
		for(String i:arr) {
			//System.out.println(i); 
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1 ); 
			}
			else {
				map.put(i, 1);
			}
		}
		
		System.out.println(map);
		
	}

}
