package complex_xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureAmzproductprice {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://amazon.in");
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone7",Keys.ENTER);

   Thread.sleep(2000);

      String xpath=
    "//span[contains(text(),' (32GB) - Rose Gold')]/../../../../../../../div[2]/div[1]/div/div[1]/div[1]//a/span[1]/span/span[2]";
   Thread.sleep(1000);
       String price=driver.findElement(By.xpath(xpath)).getText();
       System.out.println(price);
       
       price=price.replace(",", "");

       int newprice=Integer.parseInt(price);
       System.out.println(newprice-5);
		
		
	}
}
