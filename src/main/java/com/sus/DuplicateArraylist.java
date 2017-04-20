package com.sus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateArraylist {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add("sus");
		li.add("yus");
		li.add("jyo");
		li.add("banty");
		li.add("sus");
		/*List li1 = new ArrayList(new TreeSet(li));
		Set<String> set = new LinkedHashSet<String>(li);*/
		
		System.out.println(li);
		System.out.println(li.size());
	}
}
