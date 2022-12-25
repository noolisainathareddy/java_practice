package innerclass;

class outer
{
	public void show()
	{
		System.out.println("Sai inner c");
	}
	
	class inner
	{
		public void display()
		{
			System.out.println("inner class");
		}
	}
	
	static class inner2
	{
		public void display2()
		{
			System.out.println("static inner class");
		}
	}
	
}
public class demo {
	public static void main(String[] args)
	{
		outer obj = new outer();
		obj.show();
		
		outer.inner obj1 = obj.new inner(); // creating object for inner class
		obj1.display();
		
		outer.inner2 obj2 = new outer.inner2(); // creating object for static inner class
		obj2.display2();
		
	}
	

}
