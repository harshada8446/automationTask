package dropdownHandling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class eliminateDuplicate 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
       
		driver.get("file:///C:/Users/haris/Desktop/WebElement/Dropdown.html");
		
		 WebElement dropDownElement = driver.findElement(By.name("Menu"));
		 
		 Select sel = new Select(dropDownElement);
		 
		 //remove duplicate from dropdown usinf TreeSet
		 
		 TreeSet<String> ts = new TreeSet<String>();
		 
		 //to read options from dropdown
		 
		 List<WebElement> allOps = sel.getOptions();
		 
		 //read the options
		 for(int i=0;i<allOps.size();i++)
		 {
			//read the text of option
			String text = allOps.get(i).getText();
			
			//add text into treeset and maintain insertion order
			ts.add(text);
		 }
		 Thread.sleep(2000);
		 
		 //read the options from treeset
		 for(String opt:ts)
		 {
			 Thread.sleep(2000);
			 System.out.println(opt);
		 }
	}
}
