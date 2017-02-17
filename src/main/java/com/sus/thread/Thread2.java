package com.sus.thread;

public class Thread2 extends Thread{
	
	public void run()
	{
		System.out.println("run");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t2 = new Thread2();
		
		t2.start();
		System.out.println("main");
		
	}

}
