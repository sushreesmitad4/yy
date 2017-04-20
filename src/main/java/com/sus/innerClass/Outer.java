package com.sus.innerClass;

public class Outer {
	
	public void methodOne()
	{
		
		Inner in = new Inner();
		in.methodTwo();
		System.out.println("method one");
	}
	
	
	public class Inner
	{
		public void methodTwo()
		{
			System.out.println("method 2");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.methodOne();

	}

}
