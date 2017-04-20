package com.sus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		   List<TestDTO> test = new ArrayList<TestDTO>();
		   TestDTO t =null;
		   
		   t =new TestDTO();
		   t.setAge("1");
		   t.setName("sus");
		   TestDTO t1 = new TestDTO();
		   t1.setAge("2");
		   t1.setName("mik");
		   test.add(t);
		   test.add(t1);
		   System.out.println(test);

		  
		   for(TestDTO  tf: test)
		   {
		   tf.setAge("10");
		   
		   tf.setName("un");
		  
		  
		   }
		   
		  t = new TestDTO();
		   t.setAge("1");
		   t.setName("sus");
		   test.add(t);
		   System.out.println(test);

		   
		 
    }

	
	
}