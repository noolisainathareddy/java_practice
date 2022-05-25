package fileHandling;
import java.io.*;

class student implements Serializable
{
	int no;
	String name;
	int salary;
	
	student(int no, String name, int salary)
	{
		this.no=no;
		this.name=name;
		this.salary=salary;
		
	}
	
	public String toString()
	{
		return no+" " +name+ " " + salary;  
	}
	
}
public class file {
	public static void main(String[] args) throws Exception
	{
		student s1=new student(100,"sai",30000);
		System.out.println(s1);
		File file=new File("student.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(s1);
		oos.close();
	}
}
