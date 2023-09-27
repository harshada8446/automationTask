package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class LaunchFireFoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxOptions co=new FirefoxOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new FirefoxDriver(co);
		
		Thread.sleep(2000);
		driver.close();
	}

}
