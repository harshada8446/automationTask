package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Question2 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//How to close all the browsers
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		//scroll till open a popup window link
		WebElement childBrowser = driver.findElement(By.partialLinkText("Open a popup window"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false)",childBrowser);
		
		//click pn link 'Open a popup window'
		childBrowser.click();
		
		//get the address of all windows
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)
		{
			driver.switchTo().window(wh).close();
			Thread.sleep(3000);
		}
		
	}
}
