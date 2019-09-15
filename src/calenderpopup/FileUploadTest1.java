package calenderpopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadTest1 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://filebin.net");
		
		driver.findElement(By.id("fileField")).click();
		
		Thread.sleep(500);
		Runtime.getRuntime().exec("C:\\Users\\Soumya\\Desktop\\somurokr.exe");
		
	}
}
