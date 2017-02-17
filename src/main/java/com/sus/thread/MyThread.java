package com.sus.thread;

class ChildThread extends Thread
{
	
public void run()
{
	
for(int i=0;i<=10;i++)
{
	System.out.println("child thread");
}
}
}


public class MyThread
{
	


public static void main(String args[])
{
	
	ChildThread t = new ChildThread();
	t.start();
	for(int i = 0;i<=5;i++)
	{
		System.out.println("main thread");
	}
}

}

