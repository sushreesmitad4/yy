package com.sus;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWords {
	
	/*public static Set<String> findDuplicate(String input)
	{
		if(input == null || input.isEmpty()){ return Collections.emptySet();
		} 
		Set<String> duplicates = new HashSet<String>();
		String[] words = input.split("\\s+"); 
		Set<String> set = new HashSet<String>();
		for(String word : words)
		{ 
			if(!set.add(word))
			{ 
				duplicates.add(word);
				}
			} return duplicates;

		
		
	}*/
	
	
	public static Set<String> findDuplicate(String input)
	{
		if(input == null || input.isEmpty()){ return Collections.emptySet();
		} 
        
        Set<String> duplicates = new HashSet<String>();
        String[] words = input.split("\\s+");
        Set<String> set = new HashSet<String>();
        for(String word:words)
        {
        	if(!set.add(word))
        			{
        		
        		duplicates.add(word);
        			}
        	
        }
        return duplicates;
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
	
		System.out.println(findDuplicate(input));
	}

}
