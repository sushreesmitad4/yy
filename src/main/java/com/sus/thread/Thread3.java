package com.sus.thread;

public class Thread3 implements Runnable {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread3 t3= new Thread3();
		Thread t = new Thread();
		Thread t1=new Thread(t3);
		//t.run();
		//t.start();
		//t1.start();
		//t1.run();
		//t3.start();
		t3.run();
		for(int i = 0;i<=3;i++)
		{
		System.out.println("main");
		}
	}

	//@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<=3;i++)
		{
		System.out.println("run");
		}
	}

	
	/*public void start() {
		// TODO Auto-generated method stub
		for(int i = 0;i<=3;i++)
		{
		System.out.println("start");
		}
	}*/
}
