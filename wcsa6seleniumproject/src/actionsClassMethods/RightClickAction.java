package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction 
{
	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the bluestone application
		driver.get("https://www.bluestone.com/");
		
		//handle popup
		driver.findElement(By.id("denyBtn")).click();
		
		//identify the Rings option
		WebElement target = driver.findElement(By.xpath("//a[text()='Rings ']"));
		
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}
}
