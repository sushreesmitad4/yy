package com.sus;

import java.util.HashMap;
import java.util.Map;

class EmployeeDetail
{
	 Integer id;
	String name;
	
	EmployeeDetail(Integer id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	


@Override
public boolean equals(Object obj) {
	if(obj==null)
	{
		return false;
	}
	if(this.getClass()!= obj.getClass())
	{
		return false;
	}
	Employee o = (Employee) obj;
	return (this.id==o.id||this.id.equals(o.id.equals(obj)||this.name==o.name||this.name.equals(o.name)));
	
	
	
}
   

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	int hash=this.id==null?0:this.id.hashCode()+this.name==null?0:this.name.hashCode();
	return hash;
}

	
	/* @Override
	public boolean equals(Employee obj)
	{
		
		if(obj==null)
			return false;
		 if(this.getClass()!=obj.getClass())   //identifies whether obj is instance of Employee class or not.
             return false;
		Employee o = (Employee)o;
		
		return (o.id==this.id||o.id.equals(this.id)||no.name==this.name||o.name.equals(this.name));
	}
	*/
	
	
	
	}
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Employee,String> hm= new HashMap<Employee,String>();
		hm.put(new Employee(1,"smita"), "emp1 data1");
		
		hm.put(new Employee(2,"jyoti"), "emp2 data2");
		
		System.out.println(hm);
		System.out.println("hm1 data"+hm.get(new Employee(1,"smita")));
		
		System.out.println((hm.get(new Employee(1,"smita")).equals(hm.get(new Employee(2,"jyoti")))));
		
		
		
		hm.put(new Employee(1,"smita"), "emp data overriden");
		
		System.out.println(hm);
		System.out.println("hm1 data"+hm.get(new Employee(1,"smita")));

	}

}
