package com.sus;

import java.util.Scanner;

public class Palindrom {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	      original = in.nextLine();
	      /*System.out.println("Enter a string to check if it is a palindrome");
	      
	 i =1,j= 1,n=3
	 
	 i=1;
	 
	      int length = original.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      if (original.equals(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string is not a palindrome.");
	 */
	      
	      int length= original.length();
	      for(int i = length-1;i>=0;i--)
	    	  reverse = reverse+original.charAt(i);
	      
	      if(original.equals(reverse))
	    	  System.out.println("string is a palindrome.");
	      else
	      	  System.out.println("string is a not palindrome.");
	   }

	}


