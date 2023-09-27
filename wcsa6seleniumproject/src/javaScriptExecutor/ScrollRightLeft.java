package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollRightLeft
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		//to perform scrolling operation explicitly type cast into JavascriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for(int i=0;i<=1;i++)
		{
			Thread.sleep(4000);
			jse.executeScript("window.scrollBy(5000,0)");
		}
		
		for(int i=2;i>=0;i--)
		{
			Thread.sleep(4000);
			jse.executeScript("window.scrollBy(-5000,0)");
		}
	}
}
