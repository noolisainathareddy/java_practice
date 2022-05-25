package polymorphism;

class A
{
	public void show()
	{
		System.out.println("in A class");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("in B class");
	}
	
	public void display()
	{
		System.out.println("in B dispplay");
	}
}

class C extends A
{
	public void show()
	{
		System.out.println("IN class C");
	}
}
public class part1 {

	public static void main(String[] args)
	{
		A obj =new B(); // runtime polymorphism
		
		obj.show();
		
		//obj.display(); display method should also be in class A then it will work
		
		obj=new C(); // Dynamic method dispatching
		obj.show();
	}
}
