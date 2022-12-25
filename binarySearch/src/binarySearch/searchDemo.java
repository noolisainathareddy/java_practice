package binarySearch;
import java.util.Scanner; 

class sort
{
	
}

class search
{
	public void search(int target)
	{
		int arr[] = {2,4,6,8,9,20,30,40,50};
		
		int left = 0;
		int right = arr.length-1;
		while (left <= right)
		{
			System.out.println("left :" + left + "right : " + right);
			int midpoint = (left + right) / 2;
			System.out.println("midpoint :" + midpoint);
			
			if (arr[midpoint] == target) 
			{
				System.out.println("taget found at position :" + midpoint);
				break;
				     
			}
			else if (arr[midpoint] > target)
			{
				right = midpoint - 1;
			}
			else 
			{
				left = midpoint +1;
			}
			
		}
	}
}
public class searchDemo {

	public static void main (String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the target number :" );
		int target = sc.nextInt();
		
		search s=new search();
		s.search(target);
		
		sc.close();

		
		
		
	}
}
