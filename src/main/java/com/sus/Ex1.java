package com.sus;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		   String s= new String("tarang");
		   System.out.println(s.hashCode());
		   
		  Abu a=new Abu("tarang");
		   System.out.println(a.hashCode());
		   
    }

	}
class Abu{
	String data;
	Abu(String data)
	{
		this.data=data;
	}
	
	
	private void m() {
		System.out.println("in method1");
	}
		// TODO
	
	
}