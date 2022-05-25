package inheritance;

class c1 
{
	public int add(int i, int j)
	{
		return i+j;
	}
}

class c2 extends c1
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}

class c3 extends c2
{
	public int mul(int i, int j)
	{
		return i*j;
	}
	
}
public class example1 {

	public static void main(String[] args)
	{
		c3 cal = new c3();
		int addition = cal.add(4,5);
		int substraction = cal.sub(6,3);
		int multiplication = cal.mul(2,3);
		
		System.out.println("addition of 4, 5 is " + addition);
		System.out.println("substraction of 6, 3 is " + substraction);
		System.out.println("multiplication of 2, 3 is " + multiplication);
				
	}
}
