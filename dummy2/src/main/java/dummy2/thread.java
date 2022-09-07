package dummy2;


class T1 implements Runnable
{
	public void run()
	{
		System.out.println("sai");
	}

}

class T2 implements Runnable
{
	public void run()
	{
		System.out.println("hema");
	}

	
  }



public class thread {

	public static void main(String[] args) {
		
		T1 obj=new T1();
		T2 obj1=new T2();
		
		Thread T1=new Thread(obj);
		Thread T2=new Thread(obj1);
		
		T1.start();
		T2.start();
		
		
	}
}
