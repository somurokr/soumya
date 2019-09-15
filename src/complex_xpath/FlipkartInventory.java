package complex_xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartInventory {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://flipkart.com");
		
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ESCAPE).perform();
		
  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone7",Keys.ENTER);
  
 String x= driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
 System.out.println(x);
 
 String inventory1 []=x.split(" ");
	for (int i=0;i<inventory1.length;i++)
	{
		System.out.println(inventory1[i]);
	}
	
System.out.println(inventory1[5]);
	}
}
