package com.sus.hk;

import java.util.Scanner;

public class Day3 {
	
	 
	   public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		      int n = scan.nextInt(); 
		      scan.close();
		      String ans="";
		          
		      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		      if(n%2==1){
		          ans = "Weird";
		       }
		       else{
		           if(0<n && n<=5)
		               {
		               ans="Not Weird";
		           }
		           else if (6<n && n<=20)
		               {
		               ans="Weird";
		           }
		           else if(n>20)
		               {
		               ans="Not Weird";
		           }
		          // Complete the code 
		       }
		      System.out.println(ans);
		   }

}
