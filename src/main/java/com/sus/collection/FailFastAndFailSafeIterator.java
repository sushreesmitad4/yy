package com.sus.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafeIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fail fast iterator will not allow & throw (java.util.ConcurrentModificationException) 
		//to modify the data structure while iterating
		/*HashMap<String,String> map = new HashMap<String,String>();
		map.put("smita", "dev");
		map.put("jyo", "network");*/
		
		//fail safe iterator allow to modify the data structure while iterating
		
		
		
		//System.out.println(map);
		
		/*Iterator<String> iter = map.keySet().iterator();
		
		while(iter.hasNext())
		{
			System.out.println(map.get(iter.next()));
			
			map.put("sag", "finance");
		}*/
		/*ConcurrentHashMap<String, String> cmap = new ConcurrentHashMap<String,String>();
		cmap.put("smita", "dev");
		cmap.put("jyo", "network");
		System.out.println(cmap);
		
       Iterator<String> iter = cmap.keySet().iterator();
		
		while(iter.hasNext())
		{
			System.out.println(cmap.get(iter.next()));
			
			cmap.put("sag", "finance");
		}
		System.out.println(cmap);*/
		
		
		List<String> list = new CopyOnWriteArrayList<String>();
		//
		list.add("1");
		list.add("2");
		list.add("3");
		System.out.println(list);
		
		  Iterator<String> iter = list.iterator();
			
			while(iter.hasNext())
			{
				
				
				System.out.println(iter.next());
				
				
				
			}
			list.remove(1);
			System.out.println(list);
			
	}
		
		

}
