package com.sus.cogni;

public class HashMapInternal {
	//hashCode() -HashMap provides put(key, value) for storing and get(key) method for retrieving Values from HashMap.
	//When put() method is used to store (Key, Value) pair, HashMap implementation calls hashcode on Key object to calculate 
	//a hash that is used to find a bucket where Entry object will be stored

	
	/**
     * Associates the specified value with the specified key in this map.
     * If the map previously contained a mapping for the key, the old
     * value is replaced.
     *
     * @param key key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     *         (A <tt>null</tt> return can also indicate that the map
     *         previously associated <tt>null</tt> with <tt>key</tt>.)
     */
	
	
	/*Step 1 : First checks whether the key is null or not. If the key is null, it calls putForNullKey() method.
	 *         table[0] is always reserved for null key. Because, hash code of null is 0.

	Step 2 : If the key is not null, then it calculates the hash code of the key by calling hash() method.

	Step 3 : Calls indexFor() method by passing the hash code calculated in step 2 and length of the table[] array.
	         This method returns index in table[] array for the specified key-value pair.

	Step 4 : After getting the index, it checks all keys present in the linked list at that index ( or bucket). 
	         If the key is already present in the linked list, it replaces the old value with new value.

	Step 5 : If the key is not present in the linked list, it appends the specified key-value pair at the end of the linked list.
	
	
	*/
	 /* public V put(K key, V value) {
	        if (key == null)
	            return putForNullKey(value);
	        int hash = hash(key);
	        int i = indexFor(hash, table.length);
	          
	        
	        for (Entry<K,V> e = table[i]; e != null; e = e.next) {
	            Object k;
	            if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
	                V oldValue = e.value;
	                e.value = value;
	                e.recordAccess(this);
	                return oldValue;
	            }
	        }
	 
	        modCount++;
	        addEntry(hash, key, value, i);
	        return null;
	    }*/
	  
	  
	
	  
	  
	/* Step 1 : First checks whether specified key is null or not. If the key is null, it calls getForNullKey() method.

     *  Step 2 : If the key is not null, hash code of the specified key is calculated.

     * Step 3 : indexFor() method is used to find out the index of the specified key in the table[] array.

     *  Step 4 : After getting index, it will iterate though linked list at that position and checks for the key using equals() method. If the key is found, 
     *  //it returns the value associated with it. otherwise returns null.
	 * 
	 *  
	 *  
	 *  public V get(Object key) {
		    if (key == null)
		    return getForNullKey();
		    int hash = hash(key.hashCode());
		    for (Entry<K , V> e = table[indexFor(hash, table.length)]; e != null; e = e.next) {
		        Object k;
		        if (e.hash == hash && ((k = e.key) == key || key.equals(k)))
		            return e.value;
		    }
		    return null;
		}*/
	
	  
	/*In java if you store an object in HashMap first HashMap implementation calls the hashCode() method to find a bucket location. Then it stores both: the key and value as an Entry. NB! it stores the key also because it's crucial during retrieving the object. Two object can have the same hashcode
	 *  so if this happens then HashMap will use the same bucket location and store the second object there too. Inside it uses a LinkedList for this. (not java.util.LinkedList, but a simpler implementation)

	     During retrieving: you have a key -> hashCode() -> bucket location -> search in LinkedList by key -> returning object.

	EDIT: So you have one bucket on the same location but a bucket is a LinkedList so it can store multiple Entries. So the number of buckets is the capacity of Hashmap and describes how many Entries you can store without linking them in a list.*/


}
