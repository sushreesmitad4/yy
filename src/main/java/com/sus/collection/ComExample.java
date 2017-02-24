package com.sus.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpTest emp1 = new EmpTest();
		
		List<EmpTest> listemp = new ArrayList<EmpTest>();
		listemp.add(new EmpTest("smita",4));
		listemp.add(new EmpTest("jnii",2));
		listemp.add(new EmpTest("hema",3));
		listemp.add(new EmpTest("mukti",1));
		Collections.sort(listemp);
		
		for(EmpTest e :listemp)
		{
			System.out.println("emp names" +e.getName());
		}
		
		Collections.sort(listemp,new EmpTest());
		
		
		for(EmpTest e1:listemp)
		{
			System.out.println(e1.getName()+":"+e1.getId());
		}

	}

}
