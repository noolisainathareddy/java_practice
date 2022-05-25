package palindrome;

public class PalindromeDemo {

	public static void main(String args[])
	{
		int num = 121;
		int revNum=0;
		int temp = num; 
		
		while(num>0)
		{	 
			revNum = revNum *10 + num%10;
			num = num/10; 
			System.out.println(revNum);
		}
		if(temp == revNum)
		{
			System.out.println("Give number is palindrome");
		}
	}
	
}
