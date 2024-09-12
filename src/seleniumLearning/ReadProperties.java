package seleniumLearning;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties 
{
	
	public String readInput(String property) throws IOException
	{
		FileInputStream file = new FileInputStream("TestData\\DevData.properties"); // like a news paper
		Properties prop = new Properties(); //  news reader , 
		prop.load(file);  // give the news paper to the reader
		String value = prop.getProperty(property);
		return value;
	}
	
	
	public String readInput(String filepath,String property) throws IOException
	{
		FileInputStream file = new FileInputStream(filepath); // like a news paper
		Properties prop = new Properties(); //  news reader , 
		prop.load(file);  // give the news paper to the reader
		String value = prop.getProperty(property);
		return value;
	}
	
	public String readInput2(String filepath,String property) throws IOException
	{
		FileInputStream file = new FileInputStream(filepath); // like a news paper
		Properties prop = new Properties(); //  news reader , 
		prop.load(file);  // give the news paper to the reader
		String value = prop.getProperty(property);
		return value;
	}

}
