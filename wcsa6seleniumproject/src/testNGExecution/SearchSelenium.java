package testNGExecution;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchSelenium {
  @Test
  public void selenium_search_in_edge() throws InterruptedException 
  {
	  EdgeOptions eo = new EdgeOptions();
	  eo.addArguments("--remote-allow-origins=*");
	  
	  WebDriver driver = new EdgeDriver(eo);
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.google.com");
	  
	  driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
	  
	  Reporter.log("Selenium", true);
	  
	  Thread.sleep(2000);
	  
	  driver.quit();
  }
}
