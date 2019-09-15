package browser_control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyInvalidmsgGmail {

	public static void main(String[] args) throws Throwable {
		
		String url="https://gmail.com";
		String emailid="1";
		String expmsg="Couldn't find your Google Account";
		
		WebDriver driver= new FirefoxDriver();
		driver.get(url);
		
		driver.findElement(By.id("identifierId")).sendKeys(emailid);
		
		driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']/..")).click();
		
		Thread.sleep(1000);
		String actmsg=driver.findElement(By.xpath("//div[@class='GQ8Pzc']")).getText();
		
		System.out.println(actmsg);
		if(expmsg.equals(actmsg))
		{
			System.out.println("verified==pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
		
	}
}
