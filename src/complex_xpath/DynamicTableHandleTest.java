package complex_xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTableHandleTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		
		WebDriverWait wait= new WebDriverWait(driver, 50);
		//wait untill emaileditbox element active
		wait.until(ExpectedConditions.elementToBeClickable(By.name("email")));
		driver.findElement(By.name("email")).sendKeys("somurokr@gmail.com",Keys.ENTER);
		//wait untill password element active
		
        wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("maximumvisa22");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']/..")).click();
			
//wait untill compose button element  is visible
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		

	}
}
