package com.sus.innerClass;

public class Test {
	
public static void main(String[] args){
	
	
	Outer1 o = new Outer1();
	Outer1.Inner1 in = o.new Inner1();
	 in.methodOne();

}

}

class Outer1
{
class Inner1{
	
	public void methodOne()
	{
		System.out.println("methodOne");
	}
	
	
	
}
}