package pomPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import keywordDrivenFramework.Flib;
import pomPackage.IautoConstant;

public class BaseTest extends Flib implements IautoConstant 
{
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		//read the data from property file to get the BrowserValue and Url
		Flib flib = new Flib();
		String browserValue= flib.readPropertyData(PROP_PATH, "Browser");
		String url = flib.readPropertyData(PROP_PATH, "Url");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\haris\\eclipse-workspace\\automation\\wcsa6seleniumproject\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserValue.equalsIgnoreCase("Edge"))
		{
			EdgeOptions co=new EdgeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(co);
		} 
		else
		{
			System.out.println("enter the valid Browser Value!!!");
		}
		//maximize the browser
		   driver.manage().window().maximize();
		// apply implicit wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the WebApplication
		   System.out.println("URL: " + url );
		   driver.get(url);
	}
	public void closeBrowser()
	{
		driver.quit();
	}	   
}
