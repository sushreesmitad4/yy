package com.sus.hk;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int i = 4;
		    double d = 4.0;
		    String s = "HackerRank ";

		    Scanner scan = new Scanner(System.in);
		    int var1 = scan.nextInt();  
		    System.out.println(i + var1);  

		    double var2 = scan.nextDouble();  
		    System.out.println(d + var2); 

		    String var3= scan.next();
		    var3 += scan.nextLine();
		    System.out.println(s + var3); 

		    scan.close();
	}

}
