package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleDisableElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
			WebDriver driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("file:///C:/Users/haris/Desktop/WebElement/disableWebElement.html");
			
			//identify username textbox
			WebElement usn = driver.findElement(By.id("id1"));
			usn.sendKeys("admin");
			
			Thread.sleep(2000);
			
			//password is the disable webElement , handle it by using the JavaScript code
			//Explicit type cast into JavaScript executor
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('id2').value='Manager'");
	}

}
