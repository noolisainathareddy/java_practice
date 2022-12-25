package leetCode;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args)
	{
		int arr[] = {9}; 
		
		for(int i=arr.length-1;i>=0; i--)
		{	
			if(arr[i] !=9) {
				arr[i]++;
				break; 
			}
			else
			{
				arr[i] = 0; 	
				System.out.println("came inside"); 
			}
		}
		
		if(arr[0] == 0)
		{
			int res[] = new int[arr.length+1];
			res[0] = 1; 
			System.out.println(Arrays.toString(res));
 		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
