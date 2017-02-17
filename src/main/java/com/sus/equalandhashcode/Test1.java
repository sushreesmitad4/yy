package com.sus.equalandhashcode;

public class Test1 {
	
	
	public static void main(String args[])
	{
		String s= new String("abc");
		String s1=new String("abc");
		System.out.println(s.hashCode()==s1.hashCode());
		System.out.println(s.equals(s1));
	}

}
