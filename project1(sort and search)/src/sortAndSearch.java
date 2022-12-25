import java.util.Scanner;
import java.util.Arrays; 

class sort
{
	public int[] sortArray(int[] arr)
	{
		int k = arr.length - 1; 
	      for(int i =0; i <= (k); i++ )
	      {
	          for(int j=0; j<=(k-i-1); j++)
	          {
	              if(arr[j] > arr[j+1])
	              {
	                  int temp = arr[j];
	                  arr[j] = arr[j+1];
	                  arr[j+1] = temp;
	              };
	          }
	      }
	      return arr; 
	}
	
}

class search
{
	public void targetSearch(int target, int[] arr)
	{
		
		
		int left = 0;
		int right = arr.length-1;
		while (left <= right)
		{
		
			int midpoint = (left + right) / 2;
			
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
public class sortAndSearch {

	public static void main(String[] args)
	{
		int arr[] = {10,6,2,8,9,20,15,11,30,24,40,39,50};
		sort s1=new sort();
		
		s1.sortArray(arr); 
		
		System.out.println("Sorted array : " + Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the target number :" );
		int target = sc.nextInt();
		
		search s=new search();
		s.targetSearch(target, arr);
		
		sc.close();
	}
}
