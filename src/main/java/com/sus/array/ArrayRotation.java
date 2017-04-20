package com.sus.array;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//number of elements
		int n = sc.nextInt();
		//number of rotation
		int d = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int [] output = new int[n];
		output = arrayLeftRotation(arr,n,d);
		for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
    }

	}
	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		int length = a.length;
	    int[] result = new int[n];
	    int[] temp = new int[length-1];
		for(int i = 0;i<=n;i++)
		{
			for(int j=1;j<=k;j++)
			{
				a[length-j] = a[i];
				
			}
			
			
		}
		
		return result;
	      
    }
	
}
