package com.sus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test {
	
	
	Integer id;
	String name;
		
	
	

	public Integer getId() {
		return id;
	}



	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + "]";
	}



	
	/*@Override
	public int hashCode()
	{
		
		int hash = (id==0?0:id.hashCode()+(name==null?0:name.hashCode()));
		return hash;
			
	}
	
	@Override
	
	public boolean equals(Object obj)
	{
		
		
		if(obj==null)
		{
			return false;
		}
		if(!(obj instanceof Employee))
		{
			return false;
		}
		
		Employee emp = (Employee)obj;
		
		return (emp.id.equals(this.id)
				&& emp.id==this.id
				&&emp.name.equals(this.name)
				&& emp.name==this.name);
	}

	*/




	public static void main(String args[])
	{
		
		      // Create the sorted set
		      SortedSet set = new TreeSet(); 

		      // Add elements to the set
		      set.add("y");
		      set.add("c");
		      set.add("a");

		      // Iterating over the elements in the set
		      Iterator it = set.iterator();

		      while (it.hasNext()) {
		         // Get element
		         Object element = it.next();
		         System.out.println(element.toString());
		      }
		 
	}
	}