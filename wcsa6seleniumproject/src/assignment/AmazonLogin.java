package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		//Launch the amazon prime application
		Thread.sleep(1000);
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3Dsg9vCWKZHE9-Q5VLYzqBdpReAr-GdoEApNGjVQ3kcDflgAAAAAQAAAABktkJBcmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Foffers%2Fnonprimehomepage%3Fref_%253Ddv_web_force_root&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=257-5372038-2050855&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		//identify the email or phone no. using id locator
		Thread.sleep(1000);
		driver.findElement(By.id("ap_email")).sendKeys("9876543210");
		
		//identify the password using id locator
		Thread.sleep(1000);
		driver.findElement(By.id("ap_password")).sendKeys("man@123");
		
		//identify the signIn button using id locator
		Thread.sleep(1000);
		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(1000);
		driver.close();
	}
}