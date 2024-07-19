package basicConcepts;

import org.junit.Test;

public class ArrayInJava
{
	
	
	//Array : Is a group of memory locations with similar data type
	
	//Modifier  DataType Name = value ;
	
	public int stdMarks = 34;
	
	//Modifier DataType[]  Name =  { values } ;
	
	public int[]  studentsMarks  = {56,67,45,78,32,78,67};
	
	// Declare , Assign , Read , Write , size
	@Test
	public void fixedIntegerArray()
	{
		int[]  marks  = {56,67,45,78,32,18,37};  //7 [6]
		
		int len = marks.length;
		System.out.println("Length of the array :" + len);
		int m1 = marks[0];
		for(int i=0;i<len;i++)
		{
			int m = marks[i];  // i = 0 1 2 3  .... 6   // Reading the values
			System.out.println("Marks :" + m); //56 67 45 78 .... 37
		}
		
		System.out.println("-----------------------------------");
		for(int i=0;i<len;i++)
		{
			marks[i]  = 222+i;   // Writing values
			System.out.println("i value :"+ i);
			System.out.println("Marks after :" + marks[i]);
		}
		
		//System.out.println("Marks from 8th location :" + marks[8]);
		
		System.out.println("End of program");
		
	}
	
	
	@Test
	public void dynamicIntegerArray()
	{
		//int[]  marks  = {56,67,45,78,32,18,37};  //7 [6]
		int[] marks = new int[20];
		int len = marks.length;
		System.out.println("Length of the array :" + len);
		int m1 = marks[0];
		for(int i=0;i<len;i++)
		{
			int m = marks[i];  // i = 0 1 2 3  .... 6   // Reading the values
			System.out.println("Marks :" + m); //56 67 45 78 .... 37
		}
		
		System.out.println("-----------------------------------");
		for(int i=0;i<len;i++)
		{
			marks[i]  = 222+i;   // Writing values
			System.out.println("i value :"+ i);
			System.out.println("Marks after :" + marks[i]);
		}
		
		System.out.println("Marks from 8th location :" + marks[21]);
		
		System.out.println("End of program");
		
	}
	
	//VIP customer   - ArrayList
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
