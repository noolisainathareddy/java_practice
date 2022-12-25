import java.util.*; 

class emp
{
	int id, salary;
	static String ceo;
	public emp()
	{
		id=1;
		salary=20000;
		
	}
	
	static
	{
		ceo = "Rakesh";
	}
	
	public void show()
	{
		System.out.println("id : " + id + "salary :" + salary + "ceo :" + ceo);
	}
}
public class staticPart1 {
	
	public static void main(String[] args)
	{
		emp naveen= new emp();
		
		naveen.show(); 
		naveen.show();
	}

}
