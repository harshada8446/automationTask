package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class actiTime {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://xarisx/login.do");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}

