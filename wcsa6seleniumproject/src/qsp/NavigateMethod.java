package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateMethod {

	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		//use navigate method to launch the web application
		driver.navigate().to("https://www.google.com/");
		
		//to perform backward operation
		driver.navigate().back();
		
		//to perform forward operation
		driver.navigate().forward();
		
		//to refresh 
		driver.navigate().refresh();
	}
}
