package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//read the data from config.properties
		Properties prop = new Properties();
		
		//make the ready for read
		prop.load(fis);
		String propertyData = prop.getProperty("Url");
		System.out.println(propertyData);
	}
}
