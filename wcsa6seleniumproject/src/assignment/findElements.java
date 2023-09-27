package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class findElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//handle notification popup
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("Poha");
		Thread.sleep(2000);
		
		List<WebElement> pohaSuggestion = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for(int i=1;i<pohaSuggestion.size();i++)
		{
			System.out.println(pohaSuggestion.get(i).getText());
			Thread.sleep(2000);
		}
		
		/*Advance for loop=
		
		for(WebElement poha  : pohaSuggestion)
		{
			 Thread.sleep(2000);
			System.out.println(poha.getText());
		}*/
	}
}
