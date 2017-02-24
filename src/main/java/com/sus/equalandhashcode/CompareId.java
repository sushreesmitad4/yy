package com.sus.equalandhashcode;

import java.util.HashMap;


public class CompareId {
	
	int id;
	String name;
	
	CompareId(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	
	
	
	public int getId() {
		return id;
	}







	public String getName() {
		return name;
	}


    @Override
	public int hashCode()
	{
		System.out.println();
		int hash=(this.getId()==0?0:this.getId())+(this.getName()==null?0:this.getName().hashCode());
		System.out.println(hash);
		return hash;
	}


    @Override
    public boolean equals(Object obj) 
	{
		
		System.out.println("in equals");
		if(obj==null)
		{return false;}
		if(!(obj instanceof CompareId))
		{
			return false;
		}
		if(obj.getClass()!=this.getClass())
		{
			return false;
		}
		CompareId cid = (CompareId)obj;
		return (new Integer(cid.getId()).equals(new Integer(this.getId()))&& cid.getName().equals(this.getName()));
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareId c1= new CompareId(10,"smita");
		CompareId c2= new CompareId(10,"smita");
		HashMap<CompareId, CompareId> hm=new HashMap<>();
		hm.put(c1, c1);
		hm.put(c2, c2);
        System.out.println(hm.size());
		//System.out.println(c1.equals(c2));
		//System.out.println(c1.hashcode()==c2.hashCode());
	}

}
