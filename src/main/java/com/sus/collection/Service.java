package com.sus.collection;

import java.util.Comparator;

public class Service {
	
	private String name;
	
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Service [name=" + name + ", id=" + id + "]";
	}
	
	
	
  class CompareByName implements Comparator<Service>
  {
	  public int compare(Service s1,Service s2)
	  {
		return s1.name.compareTo(s2.name);
		  
	  }
  }
  
  
  static class CompareById implements Comparator<Service>
  {
	  public int compare(Service s3,Service s4 )
	  {
		  return s3.id.compareTo(s4.id);
	  }
  }


public Service(String name, String id) {
	
	this.name = name;
	this.id = id;
}

public Service() {
	
}
	
}
