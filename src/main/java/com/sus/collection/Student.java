package com.sus.collection;

import java.util.Comparator;

public class Student {
	
	String name;
    String id;
   
    public Student() {}
   
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
   
   
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id  + '}';
    }
 
    //Inner class
    class ComparatorName  implements Comparator<Student>{
       @Override
        public int compare(Student obj1, Student obj2) {
           //sort Employee on basis of name(ascending order)
           return obj1.name.compareTo(obj2.name);
        }
    }
   
 
    //static Inner class
    static class ComparatorId  implements Comparator<Student>{
       @Override
        public int compare(Student obj1, Student obj2) {
           //sort Employee on basis of id(ascending order)
           return obj1.id.compareTo(obj2.id);
        }
    }
    
   
}
