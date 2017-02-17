package com.sus.collection;

public class HDTV implements Comparable<HDTV> {
  
	private int size;
	private String brand;
	
	public HDTV(int size,String brand)
	{
		this.size=size;
		this.brand=brand;
	}
	

	public int getSize() {
		return size;
	}



	
	public String getBrand() {
		return brand;
	}



	


	@Override
	
	public int compareTo(HDTV tv)
	{
		if(this.getSize()>tv.getSize())
		{
			return 1;
		}
		else if (this.getSize()<tv.getSize())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDTV hdtv = new HDTV(12,"sony");
		HDTV hdtv1 = new HDTV(30,"bravia");
		
		if(hdtv.compareTo(hdtv1)>0)
		{
			System.out.println(hdtv.getBrand()+ "is better ");
		}
		else
		{
			System.out.println(hdtv1.getBrand()+ "is better");
		}

	}

}
