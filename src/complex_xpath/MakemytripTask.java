package complex_xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakemytripTask {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com");
 String close="//div[@class='button-group-custom clearfix']/button[@class='button close']";
		//driver.findElement(By.xpath(close)).click();
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Ban");
		
		Thread.sleep(500);
		Actions act= new Actions(driver);
		act.sendKeys(Keys.DOWN,Keys.ENTER).perform();
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Goa");
		Thread.sleep(500);
		act.sendKeys(Keys.DOWN,Keys.ENTER).perform();
		Thread.sleep(1000);
		String xpath="//div[@aria-label='Thu Aug 15 2019']";
		driver.findElement(By.xpath(xpath)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
			
	}
}
