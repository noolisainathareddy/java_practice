abstract class A
{
	public abstract void show();
	
	public void demo()
	{
		
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("in B show");
	}
}
public class abstractDemo {
	
	public static void main(String[] args)
	{
		A obj = new B();
		
		obj.show();
	}

}
