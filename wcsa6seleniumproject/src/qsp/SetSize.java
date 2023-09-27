package qsp;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetSize 
{
	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		//set the size of browser
		Dimension targetSize=new Dimension(450,250);
		driver.manage().window().setSize(targetSize);
		
		Point targetPosition =new Point(650,350);
		driver.manage().window().setPosition(targetPosition);
	}
}
