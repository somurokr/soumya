package complex_xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart2 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://flipkart.com");
		
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ESCAPE).perform();
		  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone7",Keys.ENTER);

WebElement exchangeoffer=driver.findElement(By.xpath("//div[text()='Exchange Offer']"));

        act.moveToElement(exchangeoffer);
        act.click().build().perform();
        
        
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
