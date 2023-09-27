package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PartialLinkTextLocator 
{

	public static void main(String[] args) throws InterruptedException 
	{	
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("up window")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
