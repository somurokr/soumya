package calenderpopup;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://gmail.com");;
		String expmsg="me";
		boolean flag=false;
		
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("your mail",Keys.ENTER);
	Thread.sleep(2000);

driver.findElement(By.xpath("//input[@type='password']")).sendKeys("your password",Keys.ENTER);
	Thread.sleep(500);
driver.findElement(By.xpath("//div[text()='Compose']")).click();

driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("your mail");
Thread.sleep(100);
driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("me");

driver.findElement(By.xpath("//div[@role='button' and  text()='Send']")).click();
	
Thread.sleep(10000);
driver.navigate().refresh();

      String xpath="//table[@class='F cf zt']/tbody/tr[*]/td[5]/div[2]/span/span";
      List<WebElement> names=driver.findElements(By.xpath(xpath));
      
      
      for(WebElement wb:names)
      {
    	  String mymsgs=wb.getText();
    	  if(mymsgs.contains(expmsg));
    	  flag=true;
    	  break;
    	  
      }
      if(flag)
      {
    	  System.out.println(expmsg+" "+"is available");
      }
      else
      {
    	  System.out.println(expmsg+" "+"is not available");
      }
      
	}
}
