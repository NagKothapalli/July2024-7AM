package basicConcepts;

import org.junit.Test;

public class GmailWithJunit 
{
    //**********************************Test Suites*************************************
	//Smoke Testing  , Regression Testing
	@Test
	public void smokeSuite()  //BVT : Build Validation Test
	{
		System.out.println("Test Suite : SMOKE");
		composeAnEmail();
		replyToEmail();
	}
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		composeAnEmail();
		replyToEmail();
		forwardAnEmail();
		deleteEmail();
	}
	//*****************************Test Cases***********************************************
	@Test   // Java Method must be public , non static , no return type , no arguments
	public void composeAnEmail()   // Test Case : Test Steps : 1 - 1.1 1.2  2 
	{
		//body
		System.out.println("TestCase : ComposeAnEmail");
		launchApplication();
		loginApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();	
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
		open();
		reply();
		logoutFromApplication();
		closeApplication();	

	}
	@Test
	public void forwardAnEmail() // Test Case    Raj
	{
		//body
		System.out.println("TestCase : ForwardAnEmail");
		//launch , login , open , forward , logout , close
		launchApplication();
		loginApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void deleteEmail() // Test Case    Tej
	{
		//body
		System.out.println("TestCase : DeleteEmail");
		//launch , login , open , delete , logout , close
		launchApplication();
		loginApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}
	
	//***********************Reusable Components*******************************************
	
	
	private void launchApplication()   // within the call
	{
		//write the required code to do a launch 15 or 20 lines of code
		//open browser , check internet , maximize , call gmail url , see page loaded , check the title of the page
		System.out.println("Launch Application");		
	}
	
	void loginApplication()   // default : with in the package
	{
		System.out.println("Login To Application");
	}
	
	protected void logoutFromApplication()   // parent and child 
	{
		System.out.println("Logout From Application");
	}
	
	public void closeApplication()  // global
	{
		System.out.println("Close Application");
	}
	
	public void compose()
	{
		System.out.println("Compose Email");
	}
	
	public void send()
	{
		System.out.println("Send Email");
	}
	
	public void open()
	{
		System.out.println("Open An Email");
	}
	
	public void reply()
	{
		System.out.println("Reply to the Email");
	}
	
	
	public void forward()
	{
		System.out.println("Forward An Email");
	}
	public void delete()
	{
		System.out.println("Delete An Email");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
