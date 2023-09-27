package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPageSource {

	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("http://xarisx/login.do");
		
		//read the source of login page
		
		String loginPageSourceCode=driver.getPageSource();
	    System.out.println(loginPageSourceCode);	
	    
	    //close the Chrome browser
	    driver.close();
	}

}
