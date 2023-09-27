package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethod {

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
		 // select single option from multiselect dropdown
         sel.selectByIndex(2);
         Thread.sleep(2000);
         
         //deselect single option from multiselect dropdown
         sel.deselectByIndex(2);
         Thread.sleep(2000);   
         
         //select multiple options
   /*      for(int i=0;i<3;i++)
         {
        	 Thread.sleep(2000);
        	 sel.selectByIndex(i);
         }
         
         Thread.sleep(2000);
         //deselect multiple options
         for(int i=0;i<3;i++)
         {
        	 Thread.sleep(2000);
        	// deselect the options according to index
        	 sel.deselectByIndex(i);
         }                             */
         
         //select multiple option from dropDown By using selectByValue method 
	/*	 String arr [] = {"v1","v2","v3","v4","v5","v6","v7","v8","v9"};
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 Thread.sleep(1000);
			 sel.selectByValue(arr[i]);
		 }
		 
         Thread.sleep(2000);
         //deselect the value by using deselectByValue method
         for(int i=0;i<arr.length;i++)
		 {
        	 Thread.sleep(1000);
			 sel.deselectByValue(arr[i]);
		 }                              */
         
   /*    Thread.sleep(2000);
         //select the option from multiselect dropdown By using selectByVisibleText()
  	     sel.selectByVisibleText("Burger");
  	     
  	     Thread.sleep(2000);
  	     
         //sel.deselectByVisibleText("Burger");
  	     sel.deselectAll();             */
  	     
         //select multiple options 
  	 /*  for(int i=0;i<3;i++)
  	     {
  	    	 Thread.sleep(2000);
  	     	 sel.selectByIndex(i);
  	     }
  	     Thread.sleep(2000); 
  	     sel.deselectAll();          */
	}
}

