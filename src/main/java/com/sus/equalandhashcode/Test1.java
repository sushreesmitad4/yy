package com.sus.equalandhashcode;


public class Test1 implements Comparable<Movie>
	

	public static void main(String args[])
	{
		/*int f1= 0;
		int f2 = 1;
		int f3 = 0;
		int n = 5;
		
		System.out.println(f1);
		System.out.println(f2);
		
		for(int i =2;i<=n;i++)
		{
			f3 = f1+f2;
			f1=f2;
			f2=f3;
			System.out.println(f3);
		}
		*/
		
		int n = 8;
		
		int[] fib = new int[n];
		
		fib[0] = 0;
		fib[1] = 1;
		System.out.println(fib[0]);
		System.out.println(fib[1]);
		
		for(int i =2;i<fib.length;i++)
		{
			fib[i] = fib[i-1]+fib[i-2];
			System.out.println(fib[i]);
		}
		
		
		
	
	}





}
