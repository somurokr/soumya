package complex_xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Framehandle {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		Thread.sleep(2000);
		driver.findElement(By.linkText("AbstractAnnotations")).click();
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		driver.close();
	}
}
