package tCases;

import org.junit.Test;

import rComponents.ReusableComponents;
//             child                   parent
public class TestCases extends ReusableComponents
{
	/*
	 * protected void launchApplication() // within the call { //write the required
	 * code to do a launch 15 or 20 lines of code //open browser , check internet ,
	 * maximize , call gmail url , see page loaded , check the title of the page
	 * System.out.println("Launch Application  from TC"); }
	 */


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
}
