import java.util.Map;
import java.util.HashMap; 
import java.util.Scanner; 
import java.util.Stack;


public class VallidP{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter string :");
		String value = sc.nextLine(); 
		
		Map<Character, Character> logos=new HashMap<>(); 
		
		logos.put('(',')'); 
		logos.put('[', ']');
		logos.put('{', '}'); 
		
		Stack<Character> valuesInside = new Stack<>();
		
		for (int i=0; i<value.length(); i++)
		{
			if(logos.containsKey(value.charAt(i)))
			{
				System.out.println("This is key");
				valuesInside.push(value.charAt(i));
			}
			
			else
			{
				System.out.println("this is not key");
				if(valuesInside.isEmpty())
				{
					System.out.println("Invalid paranthesis");
					return; 
				}
				
				if(logos.get(valuesInside.pop()) == value.charAt(i))
				{
					System.out.print("");
				}
				else 
				{
					
					System.out.println("Invalid paranthesis"); 
					return; 
				}
			}
			
		}
		if(!valuesInside.isEmpty())
		{
			System.out.println("Invalid paranthesis"); 
			return;
		};
		System.out.println("Valid paranthesis");
		sc.close(); 
	}
}