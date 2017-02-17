package com.sus;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonancy {
	//using recourson
	public static int  getFibonacci(int n)
	{
		if(n==1)
			return 1;
		if(n==2)
			return 1;
		
		return getFibonacci(n-1)+ getFibonacci(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//simple way
		/*int f1=0;
		int f2=1;
		int f3=0;
		System.out.print(+f1+" "+f2+" ");
		for(int i =3;i<=n;i++)
		{
			f3= f1+f2;
		   f1=f2;
		   f2=f3;
		  
		   System.out.println(f3);
		 
		}
		 System.out.print("");
*/
		
		//using array
		
	/*	int [] fib = new int[n];
		
		
		fib[0]=1;
		fib[1]=1;
		//System.out.print(+fib[0]+" "+fib[1]+" ");
		for(int i=2;i<fib.length;i++)
		{
			 fib[i] = fib[i-1]+fib[i-2];
			
		}
		 System.out.println(Arrays.toString(fib));
		*/
		//using recursion
			System.out.printf("\nFibonacci series in Java of number %s using recursion %n", n); 
			for (int i = 1; i<=n; i++){
	
				System.out.printf("%s ", getFibonacci(i)); }  /* * Fibonacci series in Java of a given number Recursion. */
		
		
		
	}
	
	
	

}

