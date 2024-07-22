package heirachialInheritance;

import org.junit.Test;

public class TestCases_M1 extends ReusableComponents
{
	@Test   // Java Method must be public , non static , no return type , no arguments
	public void composeAnEmail()   // Test Case : Test Steps : 1 - 1.1 1.2  2 
	{
		//ReusableComponents.welcomeMessage();
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


}
