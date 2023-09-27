package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaptopfindElements1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		//launch the webApplication 
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");

		//handle the popup
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//use laptops as sendkeys
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("laptops");
		
		//identify the search button for searching the laptop
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//select the filter as core5 for processor
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i5']")).click();
		
		//clicking on brand name's dropdown
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		
		//select filter as HP for brand name
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
		
		//clicking on operating system's dropdown
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		
		//select the filter as windows11 for operating system
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 11']")).click();
		
		//select the filter as '4★ & above' for customer ratings
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='4★ & above']")).click();
		
		//identify all the suggestion for Laptops
		Thread.sleep(2000);
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		////identify all the suggestion to price for Laptops
		Thread.sleep(2000);
		List<WebElement> allPriceSuggetions = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_13oc-S']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		
		Thread.sleep(2000);
		
	    //use looping statement to read list
		for(int i=0;i<allSuggestions.size();i++)
		{
			String nameOfLaptops = allSuggestions.get(i).getText();
			
			for(int j=i;j<=i;j++)
			{
				String nameOfPrice = allPriceSuggetions.get(i).getText();
				System.out.print(nameOfLaptops+"  "+nameOfPrice);
				Thread.sleep(2000);
			}
			System.out.println();
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
