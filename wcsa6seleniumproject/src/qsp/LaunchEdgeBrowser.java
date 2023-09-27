package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchEdgeBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		EdgeOptions co=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new EdgeDriver(co);
		
		Thread.sleep(2000);
		driver.close();
	}

}
