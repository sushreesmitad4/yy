package com.sus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastAndFailSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fail fast
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext())
		{
			Integer listElement= (Integer)iter.next();
			
			System.out.println(listElement);
			
			list.add(3);
		}*/
		
		ConcurrentHashMap<String, String> cmap = new ConcurrentHashMap<String, String>();
		cmap.put("a", "smita");
		cmap.put("b", "smita");
		Iterator<Entry<String,String>> iter = cmap.entrySet().iterator();
		
		while(iter.hasNext())
		{
			Entry<String,String> entry = iter.next();
			
			System.out.println(entry);
		}

	}

}
