
final class A
{
	public void show()
	{
		System.out.println("in A class");
	}
	
	public final void display()
	{
		System.out.println("in A display");
	}
}

class B
{
	public final void display()
	{
		System.out.println("in B display");
	}
}
class C extends B
{
	//public void display() - final method can't be overried.
}
//class B extends A - final class can't be extended by any other classes

public class finalDemo {
	
	public static void main(String[] args)
	{
		A obj=new A();
		B obj2=new B();
		
		obj2.display();
		
	}

}
