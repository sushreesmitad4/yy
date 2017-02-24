package com.sus.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> name1= new ArrayList<String>();
		name1.add("smita");
		name1.add("jyoti");
		name1.add("pintu");
		
		List<String> name2= new ArrayList<String>();
		name2.add("smita");
		name2.add("jyoti");
		name2.add("pintu");
		
		TestLambda test = new TestLambda();
		System.out.println("Sort using Java 7 syntax: ");
	    test.sortUsing7(name1);
	    System.out.println(name1);
	    System.out.println("Sort using Java 8 syntax: ");
	    test.sortUsing8(name2);
	    System.out.println(name2);
	}
	
	/*public void sortUsing7(List<String> names)
	{
		Collections.sort(names,new Comparator<String>() {
			@Override
			public int compare(String s1,String s2)
			{
				return s1.compareTo(s2);
			}
		});
	}*/
	public void sortUsing7(List<String> names)
	{
		Collections.sort(names,new Comparator<String>(){
			@Override
			public int compare(String s1,String s2)
			{
				return s1.compareTo(s2);
			}
		});
	}
	
	public void sortUsing8(List<String> names)
	{
		Collections.sort(names,(s1,s2)->s1.compareTo(s2));
	}

}
