package squareRot;
import java.util.Scanner; 

public class findsqrt {

	public static void main(String[] args)
	{
		System.out.print("Enter a number: ");  
	 
		Scanner sc = new Scanner(System.in);  
	
		int n = sc.nextInt();  
	
		System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
	}  
	
		public static double squareRoot(int num)   
		{  
			//temporary variable  
			int	 t;  
			int sqrtroot=num/2;  
			System.out.println("sqrtroor : " + sqrtroot);
			do   
			{  
			t=sqrtroot;  
			System.out.println("t : " + t);
			sqrtroot=(t+(num/t))/2;  
			System.out.println("sqrt :" + sqrtroot);
			}   
			while((t-sqrtroot)!= 0);  
			return sqrtroot;
	}
		
}
	
