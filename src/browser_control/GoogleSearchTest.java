package browser_control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ok google",Keys.ENTER);
		Thread.sleep(1000);
		
		String about=driver.findElement(By.xpath("//div[@id='resultStats']")).getText();
		System.out.println(about);
		
		
		
		
		
	}
}
