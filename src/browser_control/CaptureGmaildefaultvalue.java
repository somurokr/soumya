package browser_control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureGmaildefaultvalue {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://gmail.com");
		
		Thread.sleep(500);
		String ptitle=driver.getTitle();
		Thread.sleep(1000);
		System.out.println(ptitle);
		
		String defvalue=driver.findElement(By.id("identifierId")).getAttribute("aria-label");
		System.out.println(defvalue);
		driver.close();
		
	}	
}
