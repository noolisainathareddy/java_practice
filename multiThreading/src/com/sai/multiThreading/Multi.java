package com.sai.multiThreading;

class T1 implements Runnable 
{
	public void run()
	{
		for(int i=1;i<=5; i++)
		{
			System.out.println( i + " : Sai");
		}
	}
}

class T2 implements Runnable 
{
	public void run()
	{
		for(int j=1;j<=5; j++)
		{
			System.out.println( j + " : Hema");
		}
	}
}


public class Multi {
	public static void main(String[] args) {
		T1 obj=new T1();
		T2 obj2=new T2();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
	}

}
