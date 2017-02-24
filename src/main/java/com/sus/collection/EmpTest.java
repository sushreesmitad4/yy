package com.sus.collection;

import java.util.Comparator;

public class EmpTest implements Comparable<EmpTest>,Comparator<EmpTest>{

	private String name;
	private int id;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int compareTo(EmpTest emp)
	{
		return this.name.compareTo(emp.name);
	}
	
	public int compare(EmpTest e1,EmpTest e2)
	{
		return e1.name.compareTo(e2.name) ;
	}
	public EmpTest(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
	public EmpTest() {
		
	
	}
}
