package dummy;
import java.util.List; 
import java.util.ArrayList;

public class pascalsTrianle {
	public static void main(String[] args)
	{
		List<Integer> obj=new ArrayList<>(); 
		obj.add(1); 
		
		if(obj.size() == 1 )
		{
			obj.add(1);
		}
		
		System.out.println(obj.size());
	}
}
