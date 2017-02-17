package com.sus.hk;

import java.util.Scanner;

public class Fibonancy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		/*int f1=0;
		int f2 = 1;
		int f3=0;
		System.out.println(f1);
		System.out.println(f2);
		for(int i =2;i<=n;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.println(f3);
		}*/
		
		/*int[] fib = new int[n];
		System.out.println("length" +fib.length);
		fib[0]=1;
		fib[1]=1;
		System.out.println(fib[0]);
		System.out.println(fib[1]);
		for(int i =2;i<fib.length;i++)
		{
			
			fib[i]= fib[i-1]+fib[i-2];
			System.out.println(fib[i]);
			
		}*/
		for(int i=0;i<=n;i++)
		{
			System.out.println(getFibSeries(i));
		}
		
		}
	
	public static int getFibSeries(int n)
	{if(n==0){
		return 0;
		}
		
		if(n==1){
		return 1;
		}
		if(n==2){
		return 1;
		}
		return getFibSeries(n-1)+getFibSeries(n-2);
		
		
	}

	

}
