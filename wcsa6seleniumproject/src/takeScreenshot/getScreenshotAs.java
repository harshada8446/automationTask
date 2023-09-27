package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class getScreenshotAs {

	public static void main(String[] args) throws IOException 
	{

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
	    WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("admin@123");
		driver.findElement(By.name("password")).sendKeys("i dont know");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
		//explicit type cast into takescreenshot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/instagram.jpg");
		
		Files.copy(src, dest);
	}

}
