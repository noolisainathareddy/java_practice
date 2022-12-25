import java.util.Scanner;

public class FibonacciDemo 
{
	
	public static void main(String args[])

	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number : ");
		int num = sc.nextInt(); 
		int num1=0, num2=1;
		int sum =0; 
		
				System.out.print(num1 + " " + num2);
			
		for(int i=2; i<num; i++) 
		{
			sum = num1 + num2; 
			System.out.print(" " +sum);
			num1=num2;
			num2=sum; 
				
		}	
	}
}
