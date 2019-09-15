package complex_xpath;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NewTabTest {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ESCAPE).perform();
		driver.findElement(By.name("q")).sendKeys("iphone7",Keys.ENTER);
		//open different different tab
		Thread.sleep(3000);
driver.findElement(By.xpath("//div[text()='Apple iPhone 7 Plus (Silver, 256 GB)']")).click();;
driver.findElement(By.xpath("//div[text()='Apple iPhone 7 Plus (Rose Gold, 256 GB)']")).click();;
driver.findElement(By.xpath("//div[text()='Apple iPhone 7 Plus (Black, 128 GB)']")).click();;
//capture parent window session id	
      String bopa=driver.getWindowHandle();
      System.out.println("parent window is"+bopa);
      //capture all session id  or all windows opened by Webdriver
             Set<String>allwindows=driver.getWindowHandles();
             int count=allwindows.size();
             System.out.println(count);
             ArrayList<String>tabs=new ArrayList<>(allwindows);
            //click on apple  iphone7 black 128gb
             driver.switchTo().window(tabs.get(1));
             Thread.sleep(500);
             System.out.println("tittle of the page is"+driver.getTitle());
        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
        Thread.sleep(2000);
       // driver.close();
        Thread.sleep(500);
        driver.switchTo().window(bopa);
        System.out.println("page tittle is"+driver.getTitle());
             
	
		
		
	}
}
