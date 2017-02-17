package com.sus.hk;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
        double mealCost = sc.nextDouble(); // original meal price
        int tipPercent = sc.nextInt(); // tip percentage
        int taxPercent = sc.nextInt(); // tax percentage
        sc.close();
       double tip = mealCost*tipPercent/100;
       
           double tax = mealCost*taxPercent/100;
        // Write your calculation code here.
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost+tipPercent+taxPercent);
      System.out.println("The total meal cost is"+""+totalCost+""+"dollars.");
        // Print your result
	}

}
