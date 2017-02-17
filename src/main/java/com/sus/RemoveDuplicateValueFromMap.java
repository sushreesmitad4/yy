package com.sus;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateValueFromMap {
	/* public  Map<Integer, String> find(Map<Integer, String> map)
     {
     Map<String,Integer> tmpMap = new HashMap<String,Integer>();
     for(Map.Entry<Integer, String> entry : map.entrySet()) {
         if (!tmpMap.containsKey(entry.getValue())) {
             tmpMap.put(entry.getValue(), entry.getKey());
         }
     }
     for(Map.Entry<String,Integer> entry : tmpMap.entrySet()) {
         map.put(entry.getValue(), entry.getKey());
     }
    return map;
	}
*/
	private static void removeTheFirstNameDuplicates(final Map<String, String> map) {
	    final Iterator<Entry<String, String>> iter = map.entrySet().iterator();
	  
	    final HashSet<String> valueSet = new HashSet<String>();
	    while (iter.hasNext()) {
	        final Entry<String, String> next = iter.next();
	        if (!valueSet.add(next.getValue())) {
	        	
	            iter.remove();
	        }
	    }
	    System.out.println(map);
	}

	public static void main(String[] args) {
		HashMap map =new HashMap();
		 map.put("Vivaldi","Antonio");
		    map.put("Belucci", "Monica");
		    map.put("Gudini", "Harry");
		    map.put("Verdo", "Dhuzeppe");
		    map.put("Maracci", "Bruno");
		    map.put("Carleone", "Vito");
		    map.put("Bracco", "Luka");
		    map.put("Stradivari", "Antonio");
		    System.out.println(map);
		removeTheFirstNameDuplicates(map);
	}
}    


