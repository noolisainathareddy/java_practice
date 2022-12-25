package inheritance;

class A
{
	public A()
	{
		System.out.println("in A");
	}
	
	public A(int i)
	{
	
		System.out.println("in A int");
	}
		
}

class B extends A
{
	public B()
	{
	
		//super(9)
		System.out.println("in B");
	}
	
	public B(int i)
	{
		super(9);
		System.out.println("in B int");
	}
}
public class sample {

	public static void main(String[] args)
	{
		 B b1 = new B(8);
	}
}
