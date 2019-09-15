package complex_xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturealliphone7_prodct_price {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone7",Keys.ENTER);
		List<WebElement> lst=driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone 7')]"));
		System.out.println(lst.size());
	
		String productlist , productprice;
		
	for(WebElement wb: lst)
		{
			productlist=wb.getText();
					System.out.println(productlist);
		}
    String pricelistxpath=
   "//span[contains(text(),'Apple iPhone 7')]/../../../../../../../div[2]/div[1]/div/div[1]/div[1]//a/span[1]/span/span[2]";
		List<WebElement> lst1=driver.findElements(By.xpath(pricelistxpath));
		
	for(WebElement wb1:lst1)
	{
		productprice=wb1.getText();
		System.out.println(productprice);
	}
		}
	}

