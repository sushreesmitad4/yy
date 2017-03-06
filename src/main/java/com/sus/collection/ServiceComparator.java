package com.sus.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServiceComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Service> serviceList = new ArrayList<Service>();
		
		serviceList.add(new Service("smita","12"));
		serviceList.add(new Service("anuska","1"));
		serviceList.add(new Service("zubin","6"));
		serviceList.add(new Service("teloyr","8"));
		
		System.out.println("before sorting the list" +serviceList);
		
		Collections.sort(serviceList,new Service().new CompareByName());

	}

}
