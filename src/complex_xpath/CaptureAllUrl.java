package complex_xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureAllUrl {
public static void main(String[] args) {
	

	WebDriver driver= new FirefoxDriver();
	driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://google.com");
	driver.findElement(By.name("q")).sendKeys("wipro jobs",Keys.ENTER);
	
	List<WebElement> lst=driver.findElements(By.xpath("//cite"));
	
	System.out.println(lst.size());
	
	for(int i=0;i<lst.size();i++)
	{
		System.out.println(lst.get(i).getText());
	}
	

}
}
