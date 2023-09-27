package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class getOptionsMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
        driver.get("file:///C:/Users/haris/Desktop/WebElement/singleSelectDropdown.html");

		WebElement dropDownElement = driver.findElement(By.name("Menu"));
	
	       Select sel = new Select(dropDownElement);
	       
	       // to read all options from dropDown 
	       List<WebElement> allOptions = sel.getOptions();
	      
	       for(WebElement opt:allOptions)		   
	       {
		    	
		    	   String op = opt.getText();
		    	   Thread.sleep(2000);
	    	       System.out.println(op);		    	   
	       } 
	}
}
