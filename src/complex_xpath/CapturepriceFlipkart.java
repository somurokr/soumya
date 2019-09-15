package complex_xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CapturepriceFlipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://flipkart.com");
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ESCAPE).perform();
   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone7",Keys.ENTER);
   
        //capture the price of iphone7 silver 128 gb
          Thread.sleep(1000);
   
   String expprice="47,999";
 String price="//div[text()='Apple iPhone 7 (Silver, 128 GB)']/../../div[2]/div[1]/div/div[1]";
   
		  String actprice=driver.findElement(By.xpath(price)).getText();
		 
	actprice=actprice.substring(1).replace(",", "");
		  
		int actprice1=Integer.parseInt(actprice);
		System.out.println(actprice1-10);
		
	}

}
