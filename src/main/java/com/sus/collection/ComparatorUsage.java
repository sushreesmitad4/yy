package com.sus.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student emp1 = new Student("sam", "4");
		Student emp2 = new Student("amy", "2");
		Student emp3 = new Student("brad", "1");

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		System.out.println("list Before sorting : \n" + list);

		Collections.sort(list, new Student().new ComparatorName());
		System.out
				.println("\nlist after sorting on basis of name(ascending order), " + "using inner class : \n" + list);

		Collections.sort(list, new Student.ComparatorId());
		System.out.println(
				"\nlist after sorting on basis of id(ascending order), " + "using static inner class : \n" + list);

	}

}
