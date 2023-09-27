package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOptionsMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("file:///C:/Users/haris/Desktop/WebElement/Dropdown.html");
		
		WebElement dropDownEle = driver.findElement(By.name("Menu"));
		
		Select sel = new Select(dropDownEle);
		
		//select the options from dropdown
		for(int i=0;i<2;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		Thread.sleep(2000);
		
		//to read the options that are selected
		List<WebElement> allOptions = sel.getAllSelectedOptions();
		
		//print the options that are selected
		for(WebElement opt : allOptions)
		{
			Thread.sleep(2000);
			System.out.println(opt.getText());
		}
	}
}
