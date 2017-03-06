package com.sus.cogni;

import java.util.HashSet;

public class HashSetInternalWork {
	/*HashSet uses HashMap internally to store it’s objects. Whenever you create a HashSet object,
    one HashMap object associated with it is also created. This HashMap object is used to store the 
    elements you enter in the HashSet. The elements you add into HashSet are stored as keys of this HashMap object. 
    The value associated with those keys will be a constant.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Whenever you insert an element into HashSet using add() method, it actually creates an entry 
		in the internally backing HashMap object with element you have specified as it’s key and constant 
		called “PRESENT” as it’s value. This “PRESENT” is defined in the HashSet class as below.*/
		// Dummy value to associate with an Object in the backing Map
		//private static final Object PRESENT = new Object();
		HashSet<String> set = new HashSet<String>();
		 
        //Adding elements to HashSet
		/*public boolean add(E e)
		{
		        return map.put(e, PRESENT)==null;
		}*/
		
		
		/*You can notice that, add() method of HashSet class internally calls put()
		method of backing HashMap object by passing the element you have specified as
		a key and constant “PRESENT” as it’s value.

		remove() method also works in the same manner.*/

		/*public boolean remove(Object o)
		{
		        return map.remove(o)==PRESENT;
		}*/
 
        set.add("RED");
 
        set.add("GREEN");
 
        set.add("BLUE");
 
        set.add("PINK");
        set.add("RED");
        //Removing "RED" from HashSet
        System.out.println(set);
 
        set.remove("RED");
        System.out.println(set);
        

	}

}
