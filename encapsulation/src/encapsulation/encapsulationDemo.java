package encapsulation;


class A
{
	private int a;
	private String  name;
	
	public void getA(int a)
	{
		this.a=a;
	}
	
	public int setA()
	{
		return a; 
	}
	
	public void getName(String name)
	{
		this.name=name; 
	}
	
	public void show()
	{
		System.out.println(name);
	}
	
	
}
public class encapsulationDemo {
	
	public static void main(String[] args)
	{
		A obj=new A();
		obj.getA(4);
		obj.getName("sai");
		
		obj.show();
		
		System.out.println(obj.setA());
		
	
		
	}
}
