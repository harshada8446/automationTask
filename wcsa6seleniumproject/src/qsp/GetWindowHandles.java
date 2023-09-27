package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		String parentHandle = driver.getWindowHandle(); 
		
		Thread.sleep(2000);
		//scroll till open a popup window link
		WebElement childBrowser = driver.findElement(By.partialLinkText("Open a popup window"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false)",childBrowser);
		
		//click pn link 'Open a popup window'
		childBrowser.click();
		
		//address of parent as well as child window or browser
		Set<String> allHandle = driver.getWindowHandles();
		
		System.out.println("address of parent window: "+parentHandle);
		System.out.println("address of parent as well as child window: "+allHandle);
	}

}
