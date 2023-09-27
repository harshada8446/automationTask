package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class = 'oxd-userdropdown-tab']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
