package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/haris/Desktop/WebElement/Dropdown.html");
		
		WebElement dropDown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropDown);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByValue("v1");
		Thread.sleep(2000);
		sel.selectByVisibleText("Idli");
		Thread.sleep(3000);
		
		driver.quit();	
	}
}
