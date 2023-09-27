package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleGoogleMap 
{
	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//a[@class='gb_d']")).click();
	//	driver.findElement(By.xpath("a[@aria-label='Google apps']")).click();
		
		driver.switchTo().frame("app");
		
		//click on maps
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
	}

}
