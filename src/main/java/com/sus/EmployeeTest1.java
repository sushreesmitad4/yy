package com.sus;

import java.util.HashMap;

public class EmployeeTest1 {
	
	
	String name;
	String mobile;
	public EmployeeTest1(String name,String mobile) {
	    this.name=name;
	    this.mobile=mobile;
	}

	@Override
	public int hashCode() {
	    System.out.println("calling hascode method of Employee");
	    String str=this.name;
	    Integer sum=0;
	    for(int i=0;i<str.length();i++){
	        sum=sum+str.charAt(i);
	    }
	    return sum;

	}
	@Override
	public boolean equals(Object obj) {
	    // TODO Auto-generated method stub
	    System.out.println("calling equals method of Employee");
	    EmployeeTest1 emp=(EmployeeTest1)obj;
	    if(this.mobile.equalsIgnoreCase(emp.mobile)){

	        System.out.println("returning true");
	        return true;
	    }else{
	        System.out.println("returning false");
	        return false;
	    }


	}

	public static void main(String[] args) {
	    // TODO Auto-generated method stub

		EmployeeTest1 emp=new EmployeeTest1("abc", "fff");
		EmployeeTest1 emp2=new EmployeeTest1("abc", "hhh");
	    HashMap<EmployeeTest1, EmployeeTest1> h=new HashMap<>();
	    //for (int i=0;i<5;i++){
	        h.put(emp, emp);
	        h.put(emp2, emp2);

	    //}

	    System.out.println("----------------");
	    System.out.println("size of hashmap: "+h.size());


	}

}
