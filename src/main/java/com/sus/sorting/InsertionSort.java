package com.sus.sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int[] ar = new int[s];
	         for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	         }
	         insertIntoSorted(ar);
    }
     
	public static void insertIntoSorted(int[] ar) {
        int temp = ar[ar.length -1];
        int i;
        
        for( i = ar.length -2;(i>=0)&& ar[0]>temp;i--)
        {
        	ar[i+1] = ar[i];
        	
        	printArr(ar);
        	
        }
        
        ar[i+1]=temp;
        printArr(ar);
    }
	
	private static void printArr(int[] arr)
	{
		for(int ar:arr)
		{
			System.out.print(ar+" ");
		}
		System.out.println(" ");
	}

}
