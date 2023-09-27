package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://xarisx/login.do");
		
		//identify the username textbox and pass the invalid input
	    driver.findElement(By.name("username")).sendKeys("admin123");
		
	    //identify the password textbox and pass the valid input
		WebElement passwordTextBox = driver.findElement(By.name("pwd"));
		passwordTextBox.sendKeys("manager");
		
		//identify the login button and click
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		Thread.sleep(2000);
		
		//identify username textbox and clear the input
		driver.findElement(By.name("username")).clear();
	}
}
