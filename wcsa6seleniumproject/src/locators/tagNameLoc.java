package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class tagNameLoc {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/haris/Desktop/WebElement/simple1.html");
		
		//identify Username textbox by using tagName locator
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("admin");
		
		//identify Password textbox by using tagName locator
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("manager");	
	}

}
