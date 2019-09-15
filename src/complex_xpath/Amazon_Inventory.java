package complex_xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_Inventory {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://amazon.com");
		
		//search for a product
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone7",Keys.ENTER);

		//capture the inventory count
String invcount="//span[contains(text(),'results for')]";
		String inventory=driver.findElement(By.xpath(invcount)).getText();
		String inventory1[]=inventory.split(" ");
		for(int i=0;i<inventory1.length;i++)
		{
			
			System.out.println(inventory1[i]);
		}
                  int actinventorycount=Integer.parseInt(inventory1[2]);
                  System.out.println(actinventorycount-5);

	}
}
