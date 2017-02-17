package com.sus;

import java.util.HashMap;

public class CompareEmpObject {
	
	String name;
	int id;

	public CompareEmpObject(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode");
		String str = this.getName();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += sum + str.charAt(i);
		}
		return sum;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if (obj == null) {
			return false;
		}
		if (obj.getClass() != this.getClass()) {
			return false;
		}
		CompareEmpObject emp = (CompareEmpObject) obj;

		if (this.getName().equals(emp.getName())) {

			System.out.println("returning true");
			return true;
		} else {
			System.out.println("returning false");
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompareEmpObject emp1=new CompareEmpObject(10, "smita");
		CompareEmpObject emp2=new CompareEmpObject(12, "smita");
		
		HashMap<CompareEmpObject, CompareEmpObject> hm=new HashMap<>();
		hm.put(emp1, emp1);
		hm.put(emp2, emp2);
        System.out.println(hm.size());
	}

}
