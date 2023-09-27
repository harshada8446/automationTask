package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelector1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[name*='er']")).sendKeys("Qspiders");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name^='p']")).sendKeys("I don't know",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[type$='it']")).click();
	}
}
