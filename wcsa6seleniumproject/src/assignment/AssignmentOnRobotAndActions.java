package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnRobotAndActions 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the selenium application
		driver.get("https://www.selenium.dev/");

		//identify the getting started webelement
		WebElement gettingStarted = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
		//perform mouseHover on gettingStarted
		Actions act = new Actions(driver);
		act.moveToElement(gettingStarted).perform();
		//perform Right click
		act.contextClick(gettingStarted).perform();

		//pass the controls to inspect Option

		// create obj for Robot Class
		Robot robot = new Robot();
		
		
		for(int i=0;i<=9;i++)
		{
		   Thread.sleep(2000);
           robot.keyPress(KeyEvent.VK_PAGE_DOWN);
           robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
         
		}
		
		Thread.sleep(2000);
		// press the enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
