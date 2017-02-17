package com.sus;

public class ChildClass extends BaseClass {
	public  void findFName()
	{
		
		
		System.out.println("fname");
	}
	
	public static void main(String args[])
	{
		BaseClass b=new ChildClass();
		b.findName();
		b.findFName();
	}
}
