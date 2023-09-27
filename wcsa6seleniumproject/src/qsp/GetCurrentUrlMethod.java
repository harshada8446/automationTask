package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetCurrentUrlMethod {
	
	//it is used to get the url of current webpage

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		//launch the actiTime
		driver.get("http://xarisx/login.do");
		Thread.sleep(4000);
		
		//read the url of login page
		String urlOfLoginPage=driver.getCurrentUrl();
		System.out.println(urlOfLoginPage);
		
		driver.close();
	}

}
