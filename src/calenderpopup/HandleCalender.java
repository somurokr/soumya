package calenderpopup;      

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleCalender {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		int count=0;
		while(count<12)
		{
			try
			{
		          String xpath="//div[text()='February 2020']/../..//p[text()='14']";
                 driver.findElement(By.xpath(xpath)).click();
                       break;
			}
			catch(Throwable t)
			{
				String nextxpath="//span[@aria-label='Next Month']";
				driver.findElement(By.xpath(nextxpath)).click();
				count++;
			}
			
		}
		
		
		
		
	}
}
