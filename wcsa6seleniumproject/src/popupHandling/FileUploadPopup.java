package popupHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the actitime application
		driver.get("http://xarisx/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("LoginButton")).click();
		
		//click on settings module
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		
		//click on logo and color scheme
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		
		//select the radio button
		Thread.sleep(2000);
		driver.findElement(By.id("uploadNewLogoOption")).click();
		
		//double click on choose file button
		WebElement target = driver.findElement(By.xpath("//input[@name = 'formCustomInterfaceLogo.logo']"));
		
		//target.click();
		Actions act = new Actions(driver);;
		act.click(target).perform();
		
		//file upload popup will get Open
		//handle the file upload Popup
		
		Thread.sleep(4000);
		
		File file = new File("./autoItFiles/Upload.exe");
		String absPath =file.getAbsolutePath();
		Runtime.getRuntime().exec(absPath);
		
		Thread.sleep(10000);
		
		//Runtime.getRuntime().exec(absPath);
		driver.quit();
	}
}
