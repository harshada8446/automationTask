package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		// to open and close the browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//to read validUsername and validPassword
		Flib flib = new Flib();
		
		//identify uername Textbox and pass Username
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH, "Username"));
		
		//identify password Textbox and pass Password
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH, "Password"));
		
		//identify Login button and click
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();
	}
}
