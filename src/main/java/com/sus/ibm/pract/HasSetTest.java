package com.sus.ibm.pract;

import java.util.HashSet;

public class HasSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		set.add("su");
		set.add("shree");
		set.add("anus");
		System.out.println(set.size());
		set.remove("shree");
		System.out.println(set.size());

	}

}
