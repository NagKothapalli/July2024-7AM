package basicConcepts;

import org.junit.Test;

public class ConditionalStatements 
{
	//Decision making statements
	int num1 = 22;
	int num2 = 22;
	@Test
	public void simpleIfCondition()
	{
		// if(expression -> boolean : true / false ) {    task    }
		// operators : arithmetic , relational , assignment , logical
		if(num1 == num2) 
		{
			//true
			System.out.println("Both Numbers are equal");
		}
	}
	
	@Test
	public void simpleIfElseCondition()
	{
		// if(expression -> boolean : true / false ) {    task    }
		// operators : arithmetic , relational , assignment , logical
		if(num1 == num2) 
		{
			//true
			System.out.println("Both Numbers are equal");
		}
		else
		{
			System.out.println("Both Numbers are not equal");
		}
	}
	
	public void simpleIfElseCondition(int a, int b) // Method overloading   // Dev code
	{
		// if(expression -> boolean : true / false ) {    task    }
		// operators : arithmetic , relational , assignment , logical
		System.out.println("First Number :" + a);
		System.out.println("Second Number :" + b);
		if(a == b) 
		{
			//true
			System.out.println("Both Numbers are equal");
		}
		else
		{
			System.out.println("Both Numbers are not equal");
		}
	}
	
	@Test
	public void simpleIfElseCondition_test()   // Unit Test Cases
	{
		simpleIfElseCondition(55,55);
		simpleIfElseCondition(88,33);
		simpleIfElseCondition(66,-45);
	}
	
	//Write a Java program to read two numbers as input and perform addition if equal , do subtraction if a > b , do multiplication a < b
	
	
	public void simpleElseif(int a, int b) //Dev
	{
		System.out.println("User Data :" + a + " , " + b);
		if(a==b)
		{
			int sum = (a+b);
			System.out.println("Sum of two numbers :" + sum);
		}
		else if(a>b)
		{
			int diff = (a-b);
			System.out.println("Difference of two numbers :" + diff);
		}
		else if(a<b)
		{
			int prod = (a*b);
			System.out.println("Product of two numbers :" + prod);
		}		
	}
	
	@Test
	public void simpleElseif_test() //Unit Test
	{
		simpleElseif(222,22);
		
		
		simpleElseif(22,212);
		
		simpleElseif(22,22);
	}
	
	//Write a Java program to read two numbers as input and perform the below task if and only if both are above 10
	        //TASK : perform addition if equal , do subtraction if a > b , do multiplication a < b
	
	
	
	public void logicalOperators(int a, int b)   // Dev code
	{
		System.out.println("User Data :" + a + " , " + b);
		
		if((a>10) && (b>10))  // T && T -> T   // && : Logical operator
		{//true
			//Task
			if(a==b) // Nested if condition   // == , > , < : Relational operator
			{
				int sum = (a+b); // + , - , * : Arithmetic operators
				System.out.println("Sum of two numbers :" + sum);
			}
			else if(a>b)
			{
				int diff = (a-b);  // = : Assignment operator
				System.out.println("Difference of two numbers :" + diff);
			}
			else if(a<b)
			{
				int prod = (a*b);
				System.out.println("Product of two numbers :" + prod);
			}		
		}
		else
		{
			System.out.println("Both A and B or any one of them might be below 10");
		}
		
	}
	
	@Test
	public void logicalOperators_test()   // Unit test
	{
		logicalOperators(5,8);
		logicalOperators(45,8);
		logicalOperators(5,78);
		logicalOperators(-45,-86);
		logicalOperators(45,68);
		logicalOperators(445,68);
		logicalOperators(45,45);
	}
	
	//WAP to find a student in a class room
	@Test
	public void findStudent() //find 22  in 1-100
	{
		for(int i=1;i<=100;i++) // 1<100 , 2<100 22<100
		{
			System.out.println("Student Number :" + i);
			if(i == 22)  // 1=22 F, 2=22 F , 3=22 F .........22=22
			{ //true
				System.out.println("Student Found");
				break;
			}
		}
		
		System.out.println("Came out of the FOR loop");
	}
	
	//WAP to apply color to a build having 10 floors and 20 steps each floor 
	
	
	@Test
	public void applyColorToBuilding()
	{
		for(int floor=1;floor<=10;floor++) // floor = 1
		{
			System.out.println("*************************Apply colour to Floor :"+ floor);
			//floor=1  count steps in floor 1 - 20 steps
			for(int step=1;step<=20;step++) //till step is 20 loop will be repeated 
			{
				System.out.println("Apply color to Step :"+step);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
