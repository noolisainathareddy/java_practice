package dummy;

import java.util.Random;

public class randomGenerator {
	
	public static void main(String [] args)
	{
		Random random = new Random();
		
		int a = random.nextInt(7); 
		
		System.out.println(a);
	}

}
