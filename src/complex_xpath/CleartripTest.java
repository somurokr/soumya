package complex_xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CleartripTest {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("FromTag")).sendKeys("Ban");
		Thread.sleep(5000);
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.findElement(By.id("ToTag")).sendKeys("Goa,in");
		Thread.sleep(5000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
String date="//span[contains(text(),'2019') ]/preceding-sibling::span[contains(text(),'September')]/../../..//a[text()='15']";
    driver.findElement(By.xpath(date)).click();
    Thread.sleep(2000);
    driver.findElement(By.id("SearchBtn")).submit();
    
              List<WebElement> lst=driver.findElements(By.xpath("//ul[@class='listView flights']/li[*]//tbody[2]"));
                  System.out.println(lst.size());
                  for(WebElement wb:lst)
                  {
                	  System.out.println(wb.getText());
                  }
	}
}
