package browser_control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_control {

	public static void main(String[] args) throws Throwable {
		
		//System.setProperty("webdriver.gecko.driver","C:\\E_selenium\\geckodriver.exe" );
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("https://amazon.com");
		
		driver.findElement(By.linkText("Your Amazon.com")).click();;
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
		
		
		

	}

}
