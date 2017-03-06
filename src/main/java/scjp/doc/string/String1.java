package scjp.doc.string;

public class String1 {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("smita");
		
		//Java's String class privately maintains a pool of strings, where String literals are automatically interned.
		//When the intern() method is invoked on a String object it looks the string contained by this String object in the pool, 
		//if the string is found there then the string from the pool is returned.
		String s1 = s.intern();
		System.out.println(s==s1);
		
		String s2="smita";
		System.out.println(s1==s2);

	}*/
	
	/*
		public static void main(String[] args) 	{
			String s1=new String("bhaskar");
			String s2=s1.concat("software");
			String s3=s2.intern();
			String s4="bhaskarsoftware";
			System.out.println(s3==s4);//true
			System.out.println(s3==s4);//true

		}*/
	
	
	public static void main(String[] args) {
		/*char[] ch ={'x','y','z'};
		String s = new String(ch);
		System.out.println(s);*/
		
		/*byte[] b={100,101,102};
		String s=new String(b);
		System.out.println(s);//def
		
		
*/		
		
	
			String s="ashok";
			String s1=s.concat("software");
			//s=s+"software";
			//s+="software";
			String s2= "ashoksoftware";
			System.out.println(s1.equals(s2));//true
			System.out.println(s1==s2);//false
	}
	

}
