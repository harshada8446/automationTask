package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelector 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/haris/Desktop/WebElement/simple1.html");

		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='n1']")).sendKeys("admin");
	}

}
