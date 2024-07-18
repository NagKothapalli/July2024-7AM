package basicConcepts;

import org.junit.Test;

public class GmailWithJunit 
{
	@Test   // Java Method must be public , non static , no return type , no arguments
	public void composeAnEmail()
	{
		//body
		System.out.println("TestCase : ComposeAnEmail");
	}
	@Test
	public void replyToEmail()
	{
		//body
		System.out.println("TestCase : ReplyToEmail");
	}
	@Test
	public void forwardAnEmail()
	{
		//body
		System.out.println("TestCase : ForwardAnEmail");
	}
	@Test
	public void deleteEmail()
	{
		//body
		System.out.println("TestCase : DeleteEmail");
	}

}
