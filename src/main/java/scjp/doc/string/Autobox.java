package scjp.doc.string;

import java.util.ArrayList;

public class Autobox {
	static Integer I;
	
	public static void main(String args[])
	{
	int i = I;
	m(i);
	}
	
	public static void m(Integer i)
	{
		int k = i;
		System.out.println(k);
	}

}
