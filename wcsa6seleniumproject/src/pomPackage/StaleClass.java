package pomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaleClass 
{
	//to understand staleElementReferenceException
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://xarisx/login.do");
		
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		
	/*	WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys("admin123");
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		usnTB.clear();       */
		
		System.out.println(usnTB);
		Thread.sleep(2000);
		driver.navigate().refresh();
		usnTB.sendKeys("admin");
		System.out.println(usnTB);
		
		
	}
}
