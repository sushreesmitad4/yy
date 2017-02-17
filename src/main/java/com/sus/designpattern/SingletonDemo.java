package com.sus.designpattern;

 class Singleton {
	
	private static Singleton obj;
	//making constructor as private
	private Singleton()
	{
		
	}
	//use synchronized for thread safty as two thread cant 
	//execute simultaneously and cant return objects
	//but synchronization is costly so use syncronized block when object will create
	public static  synchronized Singleton getInstance()
	{
		synchronized(Singleton.class)
		{
		if(obj == null)
		{
			
			
			
			obj = new Singleton();
			
			}
		}
		return obj;
			
	/*	}
		else
		{	return null;}*/
	
		
	}
	
	
	public void showmsg()
	{
		System.out.println("in message");
	}
	
	//for not cloning the objects i overrided th eclone method here
	protected Object clone() throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
        /*
         * Here forcibly throws the exception for preventing to be cloned
         */
        throw new CloneNotSupportedException();
        // return super.clone();
	}

}


 public class SingletonDemo
{
	//accesssing siglton object
	public static void main(String[] args) 
		{
	
		//Singltone s = new Singltone();
		
		Singleton s = Singleton.getInstance();
		s.showmsg();
		
		try {
			Singleton s1 = (Singleton)s.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
      }
	}
