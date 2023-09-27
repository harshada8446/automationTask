package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownException {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("file:///C:/Users/haris/Desktop/WebElement/singleSelectDropdown.html");
		
		WebElement dropDownEle = driver.findElement(By.name("Menu"));
		
		
		 Select sel = new Select(dropDownEle);
		 
		 Thread.sleep(2000);
		 sel.selectByIndex(3);
		 
		 // deselect the option from single select dropdown
		 Thread.sleep(2000);
		 sel.deselectByIndex(3);

	}

}
