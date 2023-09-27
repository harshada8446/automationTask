package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		
		Thread.sleep(4000);
		driver.quit();
		

	}

}
