package com.sus.string;

public final class Immutable {
	
	 final String name;
	 final int regdNo;
	public Immutable(String name,int regdNo)
	{
		this.name=name;
		this.regdNo=regdNo;
	}
	 
	public String getName() {
		return name;
	}







	public int getRegdNo() {
		return regdNo;
	}







	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Immutable im = new Immutable("smita", 20);
		System.out.println(im.name);
		System.out.println(im.regdNo);
		
		//im.name = "jyo";
	}

}
