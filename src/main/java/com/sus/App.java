package com.sus;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Hello world!
 *
 */
public class App 
{
	
/*	static String convertFromScientificNotation(double number) {
	    // Check if in scientific notation
	    if (String.valueOf(number).toLowerCase().contains("e")) {
	        System.out.println("The scientific notation number'"
	                + number
	                + "' detected, it will be converted to normal representation with 25 maximum fraction digits.");
	        NumberFormat formatter = new DecimalFormat();
	        formatter.setMaximumFractionDigits(8);
	        return formatter.format(number);
	    } else
	        return String.valueOf(number);
	}
	private static DecimalFormat df2 = new DecimalFormat(".###");
	*/
    public static void main( String[] args )
    {

    	double d = 1.00;
    	double f= 0.0101;
    	double x = 1.01;
    	Double h= d+f+x;
    	System.out.println(h);

    

    		/*double input = 32.123456;
    		System.out.println("double : " + input);
    		System.out.println("double : " + df2.format(input));*/

    	
    }
}
