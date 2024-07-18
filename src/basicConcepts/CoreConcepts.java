package basicConcepts;

public class CoreConcepts {

	//Signature : class , variable , function/method
	
	//SIGNATURE : CLASS
	
	//Modifier class Name {   members : variables and functions    }
	
	//Modifiers : Access : private , protected , default , public
	           // Non Access : static , final
	//Naming Conventions for Class Name :  Name should always start with upper case
							// No special characters , No spaces 
							// class name and the file name must be same 
	//In a file we may have multiple classes but only one public class
	
	//SIGNATURE : VARIABLE
	
	//Modifier[opt]  DataType  Name ;    Declaration
	
	//Modifier DataType Name = value ;      
	
	public static final String  collegeName = "AIMS";
	
	int collegeCode = 254452; //Type Mismatch
	
	public double stdPercentage = 88.55;
	
	private char stdGrade = 'A';
	
	protected boolean stdResult  = true ;
	
	//SIGNATURE : FUNCTION
	
	//Modifier  ReturnType  Name(){ body } 
	
	public static void printCollegeName()
	{
		System.out.println(collegeName);
	}
	
	//main method - psvm
	
	public static void main(String[] args)
	{
		System.out.println("Hello Welcome to Java");
		//printCollegeName();
	}
}


class Yahoo
{
	public void doSomething()
	{
		String college = CoreConcepts.collegeName;
		System.out.println(CoreConcepts.collegeName);
		System.out.println(CoreConcepts.collegeName);
		System.out.println(CoreConcepts.collegeName);
		System.out.println(CoreConcepts.collegeName);
		System.out.println(CoreConcepts.collegeName);
	}
}

class FlipKart
{
	
}
