package complex_xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CaptureFlipkart_productlist {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://flipkart.com");
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ESCAPE).perform();
		
		driver.findElement(By.name("q")).sendKeys("iphone7",Keys.ENTER);
		
		List<WebElement> lst=driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone 7')]"));
		System.out.println(lst.size());
		
		for(WebElement wb:lst)
		{
			System.out.println(wb.getText());
		}
	}
}
