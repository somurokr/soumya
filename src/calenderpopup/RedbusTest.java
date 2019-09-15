package calenderpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusTest {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[@for='onward_cal']")).click();
		
		int count=0;
		
		while(count<15)
		{
			try{
	String xpath="//td[text()='Nov 2020']/../../../..//td[@class='current day'and text()='19']";
	       Thread.sleep(200);
			driver.findElement(By.xpath(xpath)).click();
			break;
			}
			catch(Throwable t)
			{
				String xpath1="//div[@id='rb-calendar_onward_cal']//button[text()='>']";
				
				driver.findElement(By.xpath(xpath1)).click();
				count++;
			}
		}
	}
	
	}
