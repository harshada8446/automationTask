package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistara 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		//handle notification popup
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		//Launch the spice jet application
		Thread.sleep(1000);
		driver.get("https://www.airvistara.com/in/en");
		
		//handle the popup
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		
		//Xpath for enter the departure city
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Select Departure City' and (@name='flightSearchFrom')]")).sendKeys("Pune");
		
		//Xpath for enter the destination city
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("Kochi");
		
		//Xpath for select passengers
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='passengers']")).click();
		

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=' btn plus_btn']")).click();
		
		//Xpath for Done button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'col-xs-12 done')]")).click();
		
		//Xpath for select Departure date
		Thread.sleep(2000);
		driver.findElement(By.name("depart")).click();
		
		//Xpath for select month
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@monthname='Aug']")).click();
		
		//Xpath for select day
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='5']")).click();
		
		//Xpath for select return day
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='10']")).click();
		
		//Xpath for book the flight
		Thread.sleep(3000);
		driver.findElement(By.id("book-flight-widget")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
