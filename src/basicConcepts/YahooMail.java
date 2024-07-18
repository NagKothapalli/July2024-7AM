package basicConcepts;

//Modifier[opt]  class  Name{ members: variables / functions }
//Access : private , default , protected , public
//NonAccess : static , final

public class YahooMail
{
	//Modifier[opt]   DtaType  Name = value ;  
	
	public static String collegeName = "JNTU";
	
	//Modifier[opt]  ReturnType  Name(){ body }
	
	  //ReturnType : yes -> DataType    , No -> void
	
	//Modifier[opt]  ReturnType  Name(arguments....){ body }
	
	//Tasks : composeAnEmail , replyToEmail , forwardAnEmail , deleteEmail
	
	//psvm
	public static void main(String[]  args)
	{
		System.out.println("Welcome to Yahoo Mail Automation");
		composeAnEmail();
		replyToEmail();
		forwardAnEmail();
		deleteEmail();
		composeAnEmail();
		replyToEmail();
		forwardAnEmail();
		deleteEmail();
		composeAnEmail();
		replyToEmail();
		forwardAnEmail();
		deleteEmail();
		composeAnEmail();
		replyToEmail();
		forwardAnEmail();
		deleteEmail();
		composeAnEmail();
		replyToEmail();
		forwardAnEmail();
		deleteEmail();
		composeAnEmail();
		replyToEmail();
		forwardAnEmail();
		deleteEmail();
		composeAnEmail();
		replyToEmail();
		forwardAnEmail();
		deleteEmail();
		composeAnEmail();
		replyToEmail();
		forwardAnEmail();
		deleteEmail();
		composeAnEmail();
		replyToEmail();
		forwardAnEmail();
		deleteEmail();
		composeAnEmail();
		replyToEmail();
		forwardAnEmail();
		deleteEmail();
		composeAnEmail();
		replyToEmail();
		forwardAnEmail();
		deleteEmail();
		composeAnEmail();
		replyToEmail();
		forwardAnEmail();
		deleteEmail();

	}
	
	public static void composeAnEmail()
	{
		//body
		System.out.println("TestCase : ComposeAnEmail");
	}
	
	public static void replyToEmail()
	{
		//body
		System.out.println("TestCase : ReplyToEmail");
	}
	
	public static void forwardAnEmail()
	{
		//body
		System.out.println("TestCase : ForwardAnEmail");
	}
	
	public static void deleteEmail()
	{
		//body
		System.out.println("TestCase : DeleteEmail");
	}
	

}
