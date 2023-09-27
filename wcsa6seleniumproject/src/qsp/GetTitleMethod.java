package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitleMethod {
	
	//it is use to get the title of current webpage

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		//launch the Instagram
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		//read the title of login page
		String titleOfPage=driver.getTitle();
		System.out.println(titleOfPage);
		
		Thread.sleep(3000);
		driver.close();
	}

}
