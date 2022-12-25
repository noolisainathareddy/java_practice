package stocks;

public class BestProfit {

	public static void main(String[] args)
	{
		int [] prices= {2,4,1};
		int n =prices.length;
	
		int small=Integer.MAX_VALUE;  
		int index=0; 
		
		
		for(int i=0;i<n;i++)
		{
			if(prices[i] < small)
			{
				small = prices[i]; 
			}
			
		}
		System.out.println(small);
	}	
}
