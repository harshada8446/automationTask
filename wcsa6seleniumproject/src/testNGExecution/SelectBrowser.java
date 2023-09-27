package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser 
{
	static WebDriver driver;
	
    @Parameters({"Browser","Url","Vusername","Vpassword"})
	
    @Test
    public void select_Browser_method(String browserValue,String url,String usn,String pass) throws InterruptedException 
    {
    	if(browserValue.equalsIgnoreCase("chrome"))
    	{
    		ChromeOptions co = new ChromeOptions();
    		co.addArguments("--remote-allow-origins=*");
    		
    		driver = new ChromeDriver(co);
    	}
    	else if(browserValue.equalsIgnoreCase("firefox"))
    	{
    		driver = new FirefoxDriver();
    	}
    	
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	driver.get(url);
    	
    	//identify username textbox
    	driver.findElement(By.name("username")).sendKeys(usn);
    //	Thread.sleep(2000);
    	
    	//identify password textbox
    	driver.findElement(By.name("pwd")).sendKeys(pass);
    //	Thread.sleep(2000);
    	
    	//identify login button
    	driver.findElement(By.id("loginButton")).click();	
    }
}
