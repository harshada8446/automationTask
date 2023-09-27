package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class confirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/haris/Desktop/WebElement/confirmation.html");
		
		//generate confirmation popup
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//handle the confirmation popup by using switchTo()
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		
//		al.accept();
//		al.dismiss();
		
		System.out.println(al.getText());
		al.dismiss();
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
