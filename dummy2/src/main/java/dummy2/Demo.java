package dummy2;


class Math
{
	public static int add(int a, int b)
	{
	
		return  a+b;		
	}

}

class Science extends Math
{
	public static int add(int a, int b, int c)
	{
	
		return  a+b;		
	}
}
public class Demo {
	
	 public static void main(String[] args)
	{ 
		Math a=new Math(); 
		
		System.out.println(Science.add(5, 7, 9));
		 
	}

}
