package com.sus;

import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Currency_Symbol {

	public static void main(String[] args) {
		String s = "Aushreesmitadhal";
		String rev = null;
		
		char[] charset = s.toCharArray();
		
		int len = charset.length;
		
		int end = charset.length-1;
		
		for(int i = end;i>=0;i--)
		{
			System.out.print(charset[i]);
		}
		
		//System.out.println(s);
    }
}

