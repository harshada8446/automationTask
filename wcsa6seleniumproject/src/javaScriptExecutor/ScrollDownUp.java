package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollDownUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://www.selenium.dev/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,-500)");
		
		for(int i=0;i<=4;i++)
		{
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,500)");
		}
		for(int i=4;i>=0;i--)
		{
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,-500)");
		}
	}
}

