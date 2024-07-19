package basicConcepts;

import org.junit.Test;

public class GmailWithJunit 
{
	@Test   // Java Method must be public , non static , no return type , no arguments
	public void composeAnEmail()   // Test Case
	{
		//body
		System.out.println("TestCase : ComposeAnEmail");
		launchApplication();
		loginApplication();

		//launch-15 , login-15 , compose , send , logout , close
	}
	@Test
	public void replyToEmail()  // Test Case   // Ram
	{
		//body
		System.out.println("TestCase : ReplyToEmail");
		//launch , login , open , reply , logout , close
		launchApplication();
		loginApplication();
	}
	@Test
	public void forwardAnEmail() // Test Case    Raj
	{
		//body
		System.out.println("TestCase : ForwardAnEmail");
		//launch , login , open , forward , logout , close
		launchApplication();
		loginApplication();
	}
	@Test
	public void deleteEmail() // Test Case    Tej
	{
		//body
		System.out.println("TestCase : DeleteEmail");
		//launch , login , open , delete , logout , close
		launchApplication();
		loginApplication();
	}
	
	//******************************************************************
	
	
	public void launchApplication()   
	{
		//write the required code to do a launch 15 or 20 lines of code
		//open browser , check internet , maximize , call gmail url , see page loaded , check the title of the page
		System.out.println("Launch Application");
		
	}
	
	public void loginApplication()
	{
		System.out.println("Login To Application");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
