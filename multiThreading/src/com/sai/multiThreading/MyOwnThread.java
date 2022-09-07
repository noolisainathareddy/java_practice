package com.sai.multiThreading;


class items extends Thread
{
	public void run()
	{
		System.out.println("This is child thread");
	}
}

public class MyOwnThread {
	
	public static void main(String[] args)
	{
			items t1=new items();
			t1.start();
			System.out.println("this is main thread");
					
	}
}
