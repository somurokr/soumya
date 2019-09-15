package browser_control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifylinkColor {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://gmail.com");
		
		String expcolor="rgba(26, 115, 232, 1)";
		WebElement wb=driver.findElement(By.xpath("//button[@type='button']"));
		Thread.sleep(1000);
		String color=wb.getCssValue("color");
		System.out.println(color);
		
		if(expcolor.equals(color))
		{
			System.out.println("color verified==pass");
		}
		else
		{
			System.out.println("color not verified");
		}
		//verify the link active or not
		boolean lnkstatus=wb.isDisplayed();
		System.out.println(lnkstatus);
		
		//verify link is broken
		String expheader="Find your email";
		wb.click();
		Thread.sleep(1000);
		
		String actheader=driver.findElement(By.xpath("//span[text()='Find your email']")).getText();
		System.out.println(actheader);
		
		if(expheader.equals(actheader))
		{
			System.out.println("link is active==pass");
		}
		else
		{
			System.out.println("link is not active==fail");
		}
	}
}
