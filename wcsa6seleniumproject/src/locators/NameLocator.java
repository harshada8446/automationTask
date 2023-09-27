package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NameLocator 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("harishgawali12@gmail.com");
		
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("i dont konw");
				
		driver.close();
	}

}
