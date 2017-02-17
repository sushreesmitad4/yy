package com.sus.vending;

public enum Item {
	
	COKE("coke",30),PEPSI("Pepsi", 35), SODA("Soda", 45);
	
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	/*public void setName(String name) {
		this.name = name;
	}*/
	public int getPrice() {
		return price;
	}
	/*public void setPrice(int price) {
		this.price = price;
	}*/
	
	private Item(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
	

}
