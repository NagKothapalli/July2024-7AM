package basicConcepts;

import org.junit.Test;

public class StringOperations
{
	//primitive data types 
	
	int num =22;  boolean result = true; char grade = 'A';
	
	//int - Integer , boolean -> Boolean char -> Character
	
	//Non primitive data type
	
	String name = "Ram";
	
	String a = "      Selenium With Java           ";
	
	String b = "  Selenium With JAVA     ";
	
	@Test
	public void basicOperations()
	{
		System.out.println("String a before trimming :" + a);
		
		int l = a.length();
		System.out.println("Length of the string :"+l);
		
		String aT = a.trim();
		System.out.println("String a after trimming :" + aT);
		
		System.out.println("Length of the string after trimming :"+ aT.length());
		
		String aL = a.toLowerCase();
		System.out.println("String a after Lowercase :"+ aL);
		
		String aU = a.toUpperCase();
		System.out.println("String a after Uppercase :" + aU);
	}
	
	@Test
	public void stringComparision()
	{
		//boolean myresult = a.equals(b);
		//boolean myresult = a.trim().equals(b.trim());
		//boolean myresult = a.trim().toLowerCase().equals(b.trim().toLowerCase());
		boolean myresult = a.trim().equalsIgnoreCase(b.trim());
		if(myresult == true)
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("Both strings are not equal");
		}
	}
	@Test
	public void stringContains()
	{
		String c = "Java";
		
		boolean r = a.contains(c);
		
		System.out.println(r);
	}
	
	String d; // null
	
	@Test
	public void nullpointerDemo()
	{
		boolean output = d.equals(a);
		System.out.println(output);
	}
	//java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "this.d" is null
	//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	//split
	@Test
	public void splitOperation()
	{
		String[] abc = a.trim().split(" ");
		
		System.out.println(abc);
		System.out.println(a.trim());
		System.out.println(abc[1]);
		System.out.println(abc[2]);
		System.out.println(abc[3]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
