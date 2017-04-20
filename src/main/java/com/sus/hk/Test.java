package com.sus.hk;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i =0;
        String w = in.next();
       char[] str = w.toCharArray();
        for(i=0;i<str.length-1;i++)
	    {
        	if(str[i]==str[i+1])
        	{System.out.println("Yes");}
        	
	    }
	}
}



