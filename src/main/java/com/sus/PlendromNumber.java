package com.sus;

import java.util.Scanner;

public class PlendromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//number Pale
		/*int n= sc.nextInt();
		int rev=0;
		int pale=n;
		int r=0;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			
		}
		System.out.println(rev);
		if(pale==rev)
		{
			System.out.println("pale");
		}
		else
		{
			System.out.println("not pale");
		}*/
		
		//String Pale
		
		String s= sc.nextLine();
		String rev="";
		String pale=s;
		int l=s.length();
		char[] charcterarr =s.toCharArray();
		for(int i = charcterarr.length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		if(rev.equalsIgnoreCase(pale))
		{
			System.out.println("pale");
		}else
		{
			System.out.println("not pale");
		}
		
		
	}

}
