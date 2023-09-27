package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the bluestone application
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		Thread.sleep(2000);
		//identify target
		WebElement target1 = driver.findElement(By.xpath("//ol[@id='loan']/li[@class='placeholder']"));
		WebElement target2 = driver.findElement(By.xpath("//ol[@id='amt8']/li[@class='placeholder']"));
		WebElement target3 = driver.findElement(By.xpath("//ol[@id='bank']/li[@class='placeholder']"));
		WebElement target4 = driver.findElement(By.xpath("//ol[@id='amt7']/li[@class='placeholder']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src1, target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src2, target2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src3, target3).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src4, target4).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
