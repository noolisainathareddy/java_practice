package dummy2;

import java.util.*;


public class Demo {
	
	 public static void main(String[] args)
	{
		
		int num = 1221;
		int pal=0; 
		while(num > 0)
		{
			pal = pal * 10 + (num % 10); 
			
			
			num = num/10; 
			//System.out.println(num);
			
		}
		System.out.println(pal);
	}

}
