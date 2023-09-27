package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class classNameLocator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		driver.switchTo().activeElement().sendKeys("joey tribbiani",Keys.ENTER);

		Thread.sleep(2000);
		driver.findElement(By.className("lNPNe")).click();

		Thread.sleep(4000);
    //  driver.navigate().back();
 
        driver.findElement(By.id("APjFqb")).clear();
		
	//	driver.switchTo().activeElement().sendKeys("Chandler Bing",Keys.ENTER); 
		
		driver.findElement(By.id("APjFqb")).sendKeys("Chandler Bing",Keys.ENTER);

		Thread.sleep(2000);
		driver.findElement(By.className("lNPNe")).click();
		
		Thread.sleep(4000);

		driver.close();
	}
}
