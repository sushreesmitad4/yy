package com.sus;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SetEx {

	/*public static void removeDuplicate(final Map<String,String> map)
	{
	final Iterator<Entry<String,String>> iter= map.entrySet().iterator();
	final Set<String> set = new HashSet<String>();
	
	while(iter.hasNext())
	{
		Entry<String,String>  next = iter.next();
		if(!set.add(next.getValue()))
		{
			iter.remove();
		}
		
		
	}
	
	
		
		
	}*/
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("1","1");
		map.put("2","1");
		map.put("3", "1");
		map.put("4","4");

		//removeDuplicate(set);
		/*
		for(Entry<String,String> entry:map.entrySet())
		{
			System.out.println("key"+" "+entry.getKey()+"value"+" "+entry.getValue());
		}*/
		//System.out.println(set);
		/*
		for(Entry<String,String> entry:map.entrySet())
		{
			System.out.println("key"+" "+entry.getKey()+"value"+" "+entry.getValue());
		}*/

		Iterator<Entry<String,String>> iter = map.entrySet().iterator();
		while(iter.hasNext())
		{
			Entry<String,String> next = iter.next();
			
			System.out.println("key"+" "+next.getKey()+"value"+" "+next.getValue());
		}
		
		
	}






}
