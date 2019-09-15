package mouse_keyboard_operation;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_assignment {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		
		WebElement wb=driver.findElement(By.xpath("//div[@id='nav-shop']//span[text()='Category']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(wb).perform();;
		
	
WebElement music = driver.findElement(By.xpath("//div[@id='nav-flyout-anchor']/div[4]/div[2]/span[5]/."));
Thread.sleep(2000);   
		act.moveToElement(music).perform();
		
		
   
		     
		     
	
		
		
		
	}
}
