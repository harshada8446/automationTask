package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class laptopsfindElements {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("laptops",Keys.ENTER);
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i5']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 11']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='4★ & above']")).click();
		
		Thread.sleep(2000);
		List<WebElement> allSuggestion = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		Thread.sleep(2000);
		//List<WebElement> allPriceSuggestion = driver.findElements(By.xpath(""));
		
		for(int i=0;i<allSuggestion.size();i++)
		{
			System.out.println(allSuggestion.get(i).getText() + " " +
			driver.findElement(By.xpath("(//div[@class='_13oc-S'])["+(i+1)+"]//div[@class='_30jeq3 _1_WHN1']")).getText());
			Thread.sleep(2000);
			driver.quit();
		}
		
		/*for(int i=0;i<allLaptop.size();i++)
		 {
		    allLaptop.get(i);
		 }
		 for(j=i;)
		 */
	}
}
