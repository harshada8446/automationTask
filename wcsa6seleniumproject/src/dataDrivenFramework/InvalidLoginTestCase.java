package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InvalidLoginTestCase 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://xarisx/login.do");
		
		//to read Invalid username and password from excel sheet
		Flib flib = new Flib();
		int rc = flib.getLastRowCount("./data/ActiTimeTestData.xlsx","Invalidcred");
		Thread.sleep(2000);
		
		for(int i=0;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx", "Invalidcred",i,0);
			String invalidUPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx", "Invalidcred",i,1);
			
			Thread.sleep(2000);
			WebElement usnTB = driver.findElement(By.name("username"));
			usnTB.sendKeys(invalidUsername);
			Thread.sleep(2000);
			
			WebElement passTB = driver.findElement(By.name("pwd"));
			passTB.sendKeys(invalidUPassword);
			Thread.sleep(2000);
			
			usnTB.clear();
			
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
		}
		System.out.println(rc);
		driver.quit();
	}
}
