package dummy;

public class smallEle {
	public static void main(String[] args)
	{
		int arr[]= {20,30,5,15,3}; 
		int temp=0;
		for(int i=0; i<arr.length-1; i++)
		{
			if (arr[i] < arr[i+1])
			{
				temp=arr[i];
			}
		}
		
		System.out.println(temp);
				
	}
}
