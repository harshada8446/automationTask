package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NetflixLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		//Launch the Netflix application
		driver.get("https://www.netflix.com/in/login");
		
		//identify the Username Textfield by using the tagName
		Thread.sleep(1000);
		driver.findElement(By.id("id_userLoginId")).sendKeys("admin@gmail.com");
		
		//identify the Password Textfield by using the id
		Thread.sleep(1000);
		driver.findElement(By.id("id_password")).sendKeys("netflix@123");
		
		//identify the sign in button by using the Xpath and click
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
