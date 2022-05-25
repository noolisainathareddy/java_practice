package methodOverriding;

class A
{
	public void show()
	{
		System.out.println("in A class");
	}
}

class B extends A
{
	@Override // override helps to indicate overriding a method and shows syntax errors if we have any 
	public void show()
	{
		super.show(); // To display class A - show method use super keyword
		System.out.println("in B class");
	}
}
public class methodOverridingDemo {

	public static void main(String[] args)
	{
		B obj=new B();
		
		obj.show();
	}
	
}
