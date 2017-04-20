package com.sus.sorting;

import java.util.Scanner;

public class Sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int[] ar = new int[s];
	         for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	         }
	         sort(ar);
	         
	         
	         
	         

	}
	public static void sort(int[] values) {
		  var length = values.length;
		  for(var i = 1; i < length; ++i) {
		    var temp = values[i];
		    var j = i - 1;
		    for(; j >= 0 && values[j] > temp; --j) {
		      values[j+1] = values[j];
		    }
		    values[j+1] = temp;
		  }
		};
}
