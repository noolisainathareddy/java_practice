package binarySearch;
import java.util.Scanner; 
import java.util.Arrays; 

class result
{
    public void printArray(int[] arr)
    {
        for(int j=0;j<arr.length; j++)
        {
            System.out.println("Element " + j + " contains " + arr[j]);    
        }
        
    }
    
    public int[] sortIntegers(int[] arr)
    {
  
    	for(int i=0;i<arr.length; i++)
    	{
    		for(int j=0;j<arr.length-1; j++)
    		{
    		
    			if(arr[j] < arr[j+1])
    			{
    				int temp=arr[j];
    				arr[j] = arr[j+1];
    				arr[j+1] = temp; 
    				
    			}
    		}
    	}
    		
        return arr;
        
    }
    public void getIntegers()
    {
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[5]; 
        for(int i=0; i <arr.length; i++)
        {
            arr[i]=sc.nextInt(); 
        }
        
        sc.close(); 
        
         
        sortIntegers(arr);
        printArray(arr);
    }
}
public class sortedArray {
	public static void main(String[] args)
	{
		result obj=new result(); 
		obj.getIntegers(); 
	}

}
