package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagNameLocator {

public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver= new ChromeDriver(co);
    driver.manage().window().maximize();
    
    driver.get("http://xarisx/login.do");
    
    WebElement usn=driver.findElement(By.tagName("input"));
    usn.sendKeys("admin");
}

}
