package com.sus.thread;

public class Thread1 extends Thread {
	public void start()
	{
		
		System.out.println("start");
		super.start();
	}
	public void run()
	{
		System.out.println("run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1();
		t1.start();
		System.out.println("main");
	}

}
