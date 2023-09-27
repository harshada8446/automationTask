package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class isMultipleMEthod 
{

	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
  //    driver.get("file:///C:/Users/haris/Desktop/WebElement/singleSelectDropdown.html");
       
		driver.get("file:///C:/Users/haris/Desktop/WebElement/Dropdown.html");
		
		WebElement dropDownEle = driver.findElement(By.name("Menu"));
		
		 Select sel = new Select(dropDownEle);
		 
		 //check whether the dropdown is multi select or not
		 System.out.println(sel.isMultiple());
	}
}
