package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PdfUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the pdf web application
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.findElement(By.xpath("//span[text()='Select PDF file']")).click();
		
		//file Upload popup will get open
		//handle the file upload popup
		
		Thread.sleep(2000);
		File file = new File("./autoItFiles/UploadPdf.exe");
		String absPath = file.getAbsolutePath();
		Runtime.getRuntime().exec(absPath);
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
