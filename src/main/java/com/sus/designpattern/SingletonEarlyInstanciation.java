package com.sus.designpattern;

public class SingletonEarlyInstanciation  implements Cloneable {
	
	
	private static SingletonEarlyInstanciation instance;
	
	
	SingletonEarlyInstanciation()
	{
		
	}

	public static synchronized SingletonEarlyInstanciation getInstance() 
	{
		synchronized (SingletonEarlyInstanciation.class) {
			
			if(instance==null)
			{
				instance = new SingletonEarlyInstanciation();
			}
			
		}
		
		return instance;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
        /*
         * Here forcibly throws the exception for preventing to be cloned
         */
        throw new CloneNotSupportedException();
        // return super.clone();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
