
import java.util.*;
import java.io.*;

class Employee implements Serializable 
{
	int empno;
	String ename;
	int salary; 
	
	
	Employee(int empno, String ename, int salary)
	{
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;
		
	}
	
	public String toString()
	{
		return empno + " " + ename + " " + salary; 
	}
}

public class FileOperations {
	public static void main(String[] args) throws Exception
	{
		int choice =-1; 
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		ArrayList<Employee> al=new ArrayList<>(); 
		File file=new File("employee.txt");
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null; 
		ListIterator li=null; 
		
		if(file.isFile())
		{
			ois=new ObjectInputStream(new FileInputStream(file));
			al=(ArrayList<Employee>)ois.readObject();
			ois.close();
		}
		do{
			System.out.println("1. Insert");
			System.out.println("2. Display");
			System.out.println("3. Search");
			System.out.println("4. Delete");
			System.out.println("5. Delete");
			System.out.println("0. Exit");
			System.out.println("Enter your choice: ");     
			choice =s.nextInt(); 
		 
		
			switch(choice)
			{
				case 1:
					
					System.out.println("How many employees you want: ");
					int n=s.nextInt(); 
					for(int i=0; i<n;i++)
					{
						System.out.println("Enter employee no: ");
						int empno=s.nextInt();
						
						System.out.println("Enter employee name: ");
						String ename=s1.nextLine();
						
						System.out.println("Enter employee salary: ");
						int salary=s.nextInt();
						
						al.add(new Employee(empno, ename, salary)); 
	
					}
					
					oos=new ObjectOutputStream(new FileOutputStream(file)); 
					oos.writeObject(al);
					oos.close();	
					break;
					
				case 2:
					if(file.isFile())
					{
						ois=new ObjectInputStream(new FileInputStream(file));
						al=(ArrayList<Employee>)ois.readObject();
						ois.close();
						
						li=al.listIterator();
						System.out.println("---------------------------------------");
						while(li.hasNext())
							System.out.println(li.next());
						System.out.println("---------------------------------------");
					}
					else
					{
						System.out.println("File not exist....");
					}
					 
					break; 
				case 3:
					if(file.isFile())
					{
						ois=new ObjectInputStream(new FileInputStream(file));
						al=(ArrayList<Employee>)ois.readObject();
						ois.close();
						
						System.out.println("Enter employee number to search ");
						int empno =s.nextInt();
						System.out.println("---------------------------------------");
						li=al.listIterator();
						boolean found=false; 
						while(li.hasNext() || found != true)
						{
							Employee e=(Employee)li.next();
							//System.out.println(e);
							if(e.empno == empno)
							{
								System.out.println(e);
								found = true;
								System.out.println("---------------------------------------"); 
							}
							
							
						}
						if(!found)
						{
							System.out.println("Record not found");
						}
						
					}
					else
					{
						System.out.println("File not exist...");
					}
					
					break; 
					
				case 4: 
					if(file.isFile())
					{
						ois=new ObjectInputStream(new FileInputStream(file));
						al=(ArrayList<Employee>)ois.readObject();
						ois.close();
						
						System.out.println("Enter employee number to Delete: ");
						int empno =s.nextInt();
						li=al.listIterator();
						boolean found=false; 
						while(li.hasNext() || found != true)
						{
							Employee e=(Employee)li.next();
							//System.out.println(e);
							if(e.empno == empno)
							{
								li.remove(); 
								found = true;
							}
							
							
						}
						if(found)
						{
						
							System.out.println("Record deleted sucessfully");
							oos=new ObjectOutputStream(new FileOutputStream(file));
							oos.writeObject(al);
							oos.close(); 
						}
						else
						{
							System.out.println("Record not found");
						}
					}
					else
					{
						System.out.println("File not exist...");
					}
					
					break; 
					
				case 5: 
					if(file.isFile())
					{
						ois=new ObjectInputStream(new FileInputStream(file));
						al=(ArrayList<Employee>)ois.readObject();
						ois.close();
						
						System.out.println("Enter employee number to Update: ");
						int empno =s.nextInt();
						li=al.listIterator();
						boolean found=false; 
						while(li.hasNext() || found != true)
						{
							Employee e=(Employee)li.next();
							//System.out.println(e);
							if(e.empno == empno)
							{
								System.out.print("Enter the employee name; ");
								String empname=s1.nextLine();
								
								System.out.print("Enter the salary");
								int sal=s.nextInt();
								li.set(new Employee(empno,empname,sal));
								found = true;
							}
							

						}
						if(found)
						{
						
							System.out.println("Record updated sucessfully");
							oos=new ObjectOutputStream(new FileOutputStream(file));
							oos.writeObject(al);
							oos.close(); 
						}
						else
						{
							System.out.println("Record not found");
						}
					}
					else
					{
						System.out.println("File not exist...");
					}
					
					break;
				case 0: 
					System.out.println("Bye!!");
					break;
				default:
					System.out.println("Please Enter a valid choice"); 					
			}
			
		}while(choice!=0);
			
		
	}

	
}
