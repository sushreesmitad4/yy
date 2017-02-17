package com.sus;


	class Hello extends Thread{
	public void run() { 
		System.out.print("Hello "); 
		Thread.yield(); 
		} 
		} 

		class World extends Thread { 
		public void run() { 
		System.out.print("World \t"); 
		} 
		} 
	

		public class TestPro { 
		public static void main(String[] args) throws InterruptedException { 
		for(int i = 0 ; i< 5; i++) { 
		new Thread(new Hello()).start(); 
		new Thread(new World()).start(); 
		Thread.sleep(10); 
		} 
		} 

}
