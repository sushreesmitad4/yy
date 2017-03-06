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
	//give the full control to the targeted compount to the work done
	//one oj=bject is rely on another object but without knowing which class its belongs to at compile time
	
	
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();
		list.add("smita");
		list.add("dhal");
		list.add("ananya");
		
		System.out.println(list);
		
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("x", "smita");
		map.put("y", "dhal");
		map.put("z", "ananya");
		System.out.println(map);
	}
	
	}