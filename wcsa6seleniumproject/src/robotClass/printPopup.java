package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class printPopup 
{
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
	
		//press ctrl+p to generate print popup
		Robot robot = new Robot();
		
		//press ctrl button
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		//press p button
		robot.keyPress(KeyEvent.VK_P);
		
		//release ctrl button
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//release p button
		robot.keyRelease(KeyEvent.VK_P);
		
		Thread.sleep(2000);
		//switch the control to cancel button
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		//hit enter button
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
